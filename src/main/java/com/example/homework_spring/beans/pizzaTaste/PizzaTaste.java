package com.example.homework_spring.beans.pizzaTaste;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PROTECTED;

@Getter
@RequiredArgsConstructor
@FieldDefaults(level = PROTECTED)
public abstract class PizzaTaste {

    @NonNull
    Integer price;
}
