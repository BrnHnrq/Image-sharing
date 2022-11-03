package com.brn.imagesharing.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class CustomExceptionHandler {
    private int status;
    private String body;
}
