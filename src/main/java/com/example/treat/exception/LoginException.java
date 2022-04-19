package com.example.treat.exception;

public class LoginException extends RuntimeException {
    public LoginException(String message) {
        super(message);
    }
}