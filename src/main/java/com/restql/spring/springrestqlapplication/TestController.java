package com.restql.spring.springrestqlapplication;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import restql.core.RestQL;
import restql.core.config.ClassConfigRepository;
import restql.core.response.QueryResponse;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author ankushnakaskar
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    private ClassConfigRepository config;

    @Autowired
    public ObjectMapper objectMapper;

    @PostMapping
    public JsonNode getQueryResult(@RequestBody QueryInputBean inputQueryBean) throws IOException {
        RestQL restQL = new RestQL(config);
//        QueryResponse response = restQL.executeQuery("from launches  only flight_number", 1);

        QueryResponse response = restQL.executeQuery(inputQueryBean.getQuery(), inputQueryBean.getArguments());
        return parseResult(response);
    }

    private JsonNode parseResult(final QueryResponse response) throws IOException {
        JsonNode jsonNode = objectMapper.readTree(response.toString());
        Iterator<String> stringIterator = jsonNode.fieldNames();
        final AtomicReference<String> nameOfResult = new AtomicReference<>();
        stringIterator.forEachRemaining(e -> {
            nameOfResult.set(e);
        });
        return jsonNode.get(nameOfResult.get()).get("result");
    }
}
