package com.github.sammejanderson.StudyAssistApp.configuration;

import com.github.sammejanderson.StudyAssistApp.dto.request.FlashcardDTO;
import com.github.sammejanderson.StudyAssistApp.enums.Container;
import com.github.sammejanderson.StudyAssistApp.service.FlashcardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DataLoader implements ApplicationRunner {

    private FlashcardService flashcardService;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        this.flashcardService.createNewCard(new FlashcardDTO(1L, "Pergunta1", "Resposta", Container.DAY));
        this.flashcardService.createNewCard(new FlashcardDTO(2L, "Pergunta", "Resposta", Container.DAY));
        this.flashcardService.createNewCard(new FlashcardDTO(3L, "Pergunta", "Resposta", Container.WEEK));
        this.flashcardService.createNewCard(new FlashcardDTO(4L, "Pergunta", "Resposta", Container.TWOWEEKS));
        this.flashcardService.createNewCard(new FlashcardDTO(5L, "Pergunta", "Resposta", Container.MONTH));
        this.flashcardService.createNewCard(new FlashcardDTO(6L, "Pergunta", "Resposta", Container.RETIRED));
    }
}
