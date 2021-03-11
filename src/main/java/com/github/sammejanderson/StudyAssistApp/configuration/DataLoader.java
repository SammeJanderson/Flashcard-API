package com.github.sammejanderson.StudyAssistApp.configuration;

import com.github.sammejanderson.StudyAssistApp.dto.request.FlashcardDTO;
import com.github.sammejanderson.StudyAssistApp.enums.Container;
import com.github.sammejanderson.StudyAssistApp.service.FlashcardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;

@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DataLoader implements ApplicationRunner {

    private FlashcardService flashcardService;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        this.flashcardService.createNewCard(new FlashcardDTO("Pergunta1", "Resposta"));
        this.flashcardService.createNewCard(new FlashcardDTO("Pergunta1", "Resposta"));
        this.flashcardService.createNewCard(new FlashcardDTO("Pergunta1", "Resposta"));
        this.flashcardService.createNewCard(new FlashcardDTO("Pergunta1", "Resposta"));
    }
}
