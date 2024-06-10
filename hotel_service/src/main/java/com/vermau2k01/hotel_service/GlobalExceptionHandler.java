package com.vermau2k01.hotel_service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.vermau2k01.hotel_service.exception.ResourceNotFoundException;
import com.vermau2k01.hotel_service.payload.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
  
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> notFoundHandler(ResourceNotFoundException ex)
    {
      String msg = ex.getMessage();
      ErrorResponse error = ErrorResponse.builder().message(msg).success(false).httpStatus(HttpStatus.NOT_FOUND).build(); 

      return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }


}
