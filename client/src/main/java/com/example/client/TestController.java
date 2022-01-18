package com.example.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final Environment env;

    @Value("${test.cred}")
    String testCred;

    @Value("${test.cred2}")
    String testCred2;

    public TestController(Environment env) {
        this.env = env;
    }

    @GetMapping("/test")
    public String test() {
        return testCred + " , " + testCred2;
    }



}
