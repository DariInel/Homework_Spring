package com.example.homework_spring.beans.pizza;

import com.example.homework_spring.beans.pizzaTaste.PizzaTaste;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaOfTheDay extends Pizza{
    public PizzaOfTheDay(@Qualifier(value = "carbonara") PizzaTaste pizzaTaste) {
        super(pizzaTaste);
    }
}
