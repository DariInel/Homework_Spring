package com.example.homework_spring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class CustomException extends java.lang.Exception{
    public String message;

    public CustomException(String message) {
        this.message = message;
    }
}
