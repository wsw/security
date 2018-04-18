package com.wsw.exception;


public class UserNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -6112780192479692859L;

    private String id;

    public UserNotFoundException(String id) {
        super("user not found");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
