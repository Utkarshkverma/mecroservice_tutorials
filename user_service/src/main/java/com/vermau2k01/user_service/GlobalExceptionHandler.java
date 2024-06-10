package com.vermau2k01.user_service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vermau2k01.user_service.exceptions.ResourceNotFoundException;
import com.vermau2k01.user_service.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex)
    {
        String msg = ex.getMessage();
        ApiResponse apiResponse = ApiResponse.builder().message(msg).success(true).httpStatus(HttpStatus.NOT_FOUND).build();

        return new ResponseEntity<>(apiResponse,HttpStatus.NOT_FOUND);  
    }

}
