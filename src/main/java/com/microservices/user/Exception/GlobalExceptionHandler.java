package com.microservices.user.Exception;

import com.microservices.user.Payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserDefinedException.class)
  public ResponseEntity<ApiResponse> handleResourceNotFoundException(UserDefinedException ex){
      String message=ex.getMessage();
        ApiResponse build = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<ApiResponse>(build,HttpStatus.NOT_FOUND);
    }
}
