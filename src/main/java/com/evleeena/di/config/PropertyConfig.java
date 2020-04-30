package com.evleeena.di.config;

import com.evleeena.di.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
    @Value("${guru.user}")
    private String user;
    @Value("${guru.password}")
    private String password;
    @Value("${guru.url}")
    private String url;

    @Resource
    private Environment environment;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(environment.getProperty("user"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }
}
