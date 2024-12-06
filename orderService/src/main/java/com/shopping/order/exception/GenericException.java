package com.shopping.order.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;
@Component
@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class GenericException extends Exception{

    public GenericException(String errorMessage) {
        super(errorMessage);
    }
    public GenericException(){}

}
