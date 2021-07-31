package com.vida.Messenger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


public class ErrorMessage {

    private String message = null;

    @GetMapping("/vehicle")
    public ResponseEntity<String> invalidDate(@RequestParam String modelYear) {

        message = "Invalid year entered... " + modelYear;
        return new ResponseEntity(message, HttpStatus.NOT_ACCEPTABLE);
    }


}
