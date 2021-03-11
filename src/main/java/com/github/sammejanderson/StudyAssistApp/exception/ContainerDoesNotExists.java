package com.github.sammejanderson.StudyAssistApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class ContainerDoesNotExists extends Exception{
    public ContainerDoesNotExists(){
        super("The container selected does not exists");
    }

}
