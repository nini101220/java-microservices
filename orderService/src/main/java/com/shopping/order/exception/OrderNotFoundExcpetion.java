package com.shopping.order.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@Component
public class OrderNotFoundExcpetion extends  Exception{

    public OrderNotFoundExcpetion(String errorMessage) {
        super(errorMessage);


    }   public OrderNotFoundExcpetion(){}
}
