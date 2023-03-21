package com.example.homework_spring.controllers;

import com.example.homework_spring.dataTransferObject.FinalModel;
import com.example.homework_spring.exceptions.CustomException;
import org.springframework.web.bind.annotation.*;

@RestController
public class JSONController {
    @RequestMapping(value = "/info", method = RequestMethod.POST, headers = {"Content-type=application/json"})
    @ResponseBody
    public FinalModel getInfo(@RequestBody FinalModel finalModel, @RequestParam(required = false,
            defaultValue = "false") boolean exception) throws CustomException {
        if (exception) {
            throw new CustomException("Error 502");
        }
        return finalModel;
    }
}
