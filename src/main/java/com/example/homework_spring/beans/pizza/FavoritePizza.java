package com.example.homework_spring.beans.pizza;

import com.example.homework_spring.beans.pizzaTaste.PizzaTaste;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FavoritePizza extends Pizza{
    public FavoritePizza(@Qualifier(value = "gorgonzola") PizzaTaste pizzaTaste) {
        super(pizzaTaste);
    }
}
