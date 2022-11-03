package com.brn.imagesharing.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ImageExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CustomExceptionHandler> handleException(ImageNotFoundException imageNotFoundException){
        CustomExceptionHandler body = new CustomExceptionHandler(HttpStatus.NOT_FOUND.value(),imageNotFoundException.getMessage());
        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }

}
