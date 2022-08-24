package com.example.userdefinedexception;

public class PlayerNotFoundException extends Exception {

    public PlayerNotFoundException(String message) {
        //if we do not write super(message), compiler automatically calling to no-argument constructor of parent class
        super(message);
    }
}
