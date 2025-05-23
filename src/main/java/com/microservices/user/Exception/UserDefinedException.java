package com.microservices.user.Exception;

public class UserDefinedException extends RuntimeException {
    public UserDefinedException() {
        super();
    }
    public UserDefinedException(String Msg) {
        super(Msg);
    }
}
