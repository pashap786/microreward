package com.micro.rewards.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class QueryServiceTest {

    private static FakerService fakerService = new FakerService();
    private static QueryService queryService;

    @BeforeAll
    public static void setUp() {
        queryService = new QueryService(fakerService);
    }

    @Test
    public void testQuery() throws Exception {
        queryService.queryBing();
    }



}
