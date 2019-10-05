package com.restql.spring.springrestqlapplication.configurations;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "project")
@Validated
@Getter
@Setter
public class ProjectConfig {


    @NotNull(message = "map of services and API's should not be null")
    private Map<String, String> serviceMapping;


}
