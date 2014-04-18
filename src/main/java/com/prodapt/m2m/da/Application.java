package com.prodapt.m2m.da;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.core.env.SimpleCommandLinePropertySource;
import org.springframework.web.client.RestTemplate;

import reactor.core.Environment;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	@Bean
    Environment env() {
    	return new Environment();
    }

    @Bean
    public RestTemplate rest() {
    	return new RestTemplate();
    }

    public static void main(String[] args) throws InterruptedException {
    	SpringApplication.run(Application.class, args);
    }
}