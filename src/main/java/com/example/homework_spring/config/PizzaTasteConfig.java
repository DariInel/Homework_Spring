package com.example.homework_spring.config;

import com.example.homework_spring.beans.pizzaTaste.Carbonara;
import com.example.homework_spring.beans.pizzaTaste.Gorgonzola;
import com.example.homework_spring.beans.pizzaTaste.PizzaTaste;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PizzaTasteConfig {

    @Bean
    @Scope(value = "prototype")
    public PizzaTaste carbonara() {
        System.out.println("*** Бин ***");
        return new Carbonara();
    }

    @Bean
    @Scope(value = "prototype")
    public PizzaTaste gorgonzola() {
        System.out.println("*** Бин ***");
        return new Gorgonzola();
    }

    @PostConstruct
    public void init() throws Exception
    {
        System.out.println("*** Запуск спринг-конейтнера ***");
    }

    @PreDestroy
    public void destroy() throws Exception
    {
        System.out.println("*** Контейнер завершил работу и бины разрушены ***");
    }
}
