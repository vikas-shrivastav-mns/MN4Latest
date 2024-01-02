package com.example;

import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Singleton
public class User {
    private String name;
    private int age;
}
