package com.github.sammejanderson.StudyAssistApp.exception;

public class CardNotFoundException extends Exception {
    public CardNotFoundException(long id){
        super ("Card with Id: "+ id + " not found");
    }

}
