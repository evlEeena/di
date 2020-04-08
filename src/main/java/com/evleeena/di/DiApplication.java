package com.evleeena.di;

import com.evleeena.di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DiApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        String result = myController.sayHello();
        System.out.println(result);
    }

}
