package com.example.homework_spring.beans.pizza;

import com.example.homework_spring.beans.pizzaTaste.PizzaTaste;
import jakarta.annotation.PostConstruct;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PROTECTED;

@RequiredArgsConstructor
@FieldDefaults(level = PROTECTED)
public abstract class Pizza {

    @NonNull
    PizzaTaste pizzaTaste;

    @PostConstruct
    public void postConstruct() {
        System.out.printf("Thank you for the order! Price : %s %n", pizzaTaste.getPrice());
    }
}
