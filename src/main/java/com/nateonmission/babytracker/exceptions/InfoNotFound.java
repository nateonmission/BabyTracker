package com.nateonmission.babytracker.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InfoNotFound  extends RuntimeException{
    public InfoNotFound(String message){
        super(message);
    }

}

