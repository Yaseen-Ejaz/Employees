package com.example.empmanager.exception;



public class UserNotFoundException extends RuntimeException {
    
    public UserNotFoundException(String s) {
        super(s);
    }

}
