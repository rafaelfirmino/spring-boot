package br.com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by rafaelfirmino on 24/11/15.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"br.com.spring"})
@EnableJpaRepositories(basePackages = {"br.com.spring.repository"})
@EntityScan(basePackages = {"br.com.spring.repository.model"})
@EnableAutoConfiguration
public class ApplicationBoot {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationBoot.class, args);
    }
}
