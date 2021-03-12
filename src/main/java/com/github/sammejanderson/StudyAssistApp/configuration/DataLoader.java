package com.github.sammejanderson.StudyAssistApp.configuration;

import com.github.sammejanderson.StudyAssistApp.dto.request.FlashcardDTO;
import com.github.sammejanderson.StudyAssistApp.service.FlashcardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DataLoader implements ApplicationRunner {

    private final FlashcardService flashcardService;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        this.flashcardService.createNewCard(new FlashcardDTO("Pergunta1", "Resposta"));
        this.flashcardService.createNewCard(new FlashcardDTO("Pergunta2", "Resposta"));
        this.flashcardService.createNewCard(new FlashcardDTO("Pergunta3", "Resposta"));
        this.flashcardService.createNewCard(new FlashcardDTO("Pergunta4", "Resposta"));
    }
}
