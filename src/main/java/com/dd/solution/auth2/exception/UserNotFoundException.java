package com.dd.solution.auth2.exception;

public class UserNotFoundException extends ApplicationException{
    public UserNotFoundException(){
        super(ServiceError.USER_NOT_FOUND, null, null);
    }
}
