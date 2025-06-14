package com.microservices.user.Exception;

import com.microservices.user.Payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handlerResourceNotFoundException(CustomException ex ){
return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
