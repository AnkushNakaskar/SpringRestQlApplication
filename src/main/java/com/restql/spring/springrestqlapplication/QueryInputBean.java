package com.restql.spring.springrestqlapplication;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ankushnakaskar
 */
@Data
public class QueryInputBean implements Serializable {

    private String query;

    private String arguments;
}
