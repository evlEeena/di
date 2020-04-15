package com.evleeena.di.controllers;

import com.evleeena.di.services.GreetingRepositoryImpl;
import com.evleeena.di.services.PrimaryGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new PrimaryGreetingService(new GreetingRepositoryImpl()));
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}