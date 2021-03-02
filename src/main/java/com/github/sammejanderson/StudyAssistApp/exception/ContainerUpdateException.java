package com.github.sammejanderson.StudyAssistApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class ContainerUpdateException extends Exception {
    public ContainerUpdateException(Long id) {
        super("Card with Id: " + id + "it's already in the day container");
    }
}
