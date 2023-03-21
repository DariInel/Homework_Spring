package com.example.homework_spring.controllers;

import com.example.homework_spring.exceptions.CustomException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.TreeMap;

@RestController
public class HeaderController {

    @GetMapping("headers")
    public Map<String, String> getHeaders(@RequestHeader Map<String, String> headers, @RequestParam(required = false,
            defaultValue = "false") boolean exception) throws CustomException {
        if (exception) {
            throw new CustomException("Error 502");
        }
        return new TreeMap<>(headers);
    }
}
