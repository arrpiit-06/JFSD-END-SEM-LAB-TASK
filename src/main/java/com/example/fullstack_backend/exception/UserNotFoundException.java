package com.example.fullstack_backend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super ("Could not found the id " + id);
    }
}