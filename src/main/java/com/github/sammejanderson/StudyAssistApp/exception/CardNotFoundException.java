package com.github.sammejanderson.StudyAssistApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CardNotFoundException extends Exception {
    public CardNotFoundException(long id){
        super ("Card with Id: "+ id + " not found");
    }

}
