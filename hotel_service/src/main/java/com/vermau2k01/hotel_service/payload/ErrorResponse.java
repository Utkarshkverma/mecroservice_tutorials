package com.vermau2k01.hotel_service.payload;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ErrorResponse {
    
    private String message;
    private Boolean success;
    private HttpStatus httpStatus;
}
