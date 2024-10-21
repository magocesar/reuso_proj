package com.example.demo.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class AlreadExistsException extends CustomException {
    public AlreadExistsException(String message) {
        super(message, HttpStatus.CONFLICT);
    }
}
