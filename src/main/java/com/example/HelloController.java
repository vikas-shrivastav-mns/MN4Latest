package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
public class HelloController {
    private final User user = new User("zhangsan", 18);
    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        return "Hello World"+user.getName();
    }
}
