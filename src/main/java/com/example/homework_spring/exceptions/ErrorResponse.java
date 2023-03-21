package com.example.homework_spring.exceptions;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ErrorResponse {
    String message;

    public ErrorResponse(String message) {
        this.message = message;
    }
}
