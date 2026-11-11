package com.adobe.aem.medeea.core;

public class GreetingService {

    public String greet(String name) {
        return "Hello, " + (name == null || name.isEmpty() ? "world" : name) + "!";
    }
}
