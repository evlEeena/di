package com.evleeena.di;

import com.evleeena.di.controllers.ConstructorInjectedController;
import com.evleeena.di.controllers.MyController;
import com.evleeena.di.controllers.PropertyInjectedController;
import com.evleeena.di.controllers.SetterInjectedController;
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

        System.out.println("\n--- Property ---");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("\n--- Setter ---");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("\n--- Constructor ---");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
