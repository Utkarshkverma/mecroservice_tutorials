package com.vermau2k01.hotel_service.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message)
    {
        super(message);
    }

    public ResourceNotFoundException()
    {
        super("Resource Not found exception");
    }

}
