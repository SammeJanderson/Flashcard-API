package com.github.sammejanderson.StudyAssistApp.exception;

public class ContainerUpdateException extends Exception {
    public ContainerUpdateException(Long id) {
        super("Card with Id: " + id + "it's already in the day container");
    }
}
