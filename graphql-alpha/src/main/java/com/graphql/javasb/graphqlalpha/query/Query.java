package com.graphql.javasb.graphqlalpha.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    public String initialQuery() {
        return "test query result";
    }

    public String test() {
        return "test";
    }

}
