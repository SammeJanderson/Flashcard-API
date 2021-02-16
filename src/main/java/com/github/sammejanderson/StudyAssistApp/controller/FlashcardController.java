package com.github.sammejanderson.StudyAssistApp.controller;

import com.github.sammejanderson.StudyAssistApp.dto.request.FlashcardDTO;
import com.github.sammejanderson.StudyAssistApp.dto.response.MessageDTO;
import com.github.sammejanderson.StudyAssistApp.exception.CardNotFoundException;
import com.github.sammejanderson.StudyAssistApp.service.FlashcardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/flashcard")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class FlashcardController {
    private FlashcardService flashcardService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public MessageDTO createNewCard(@RequestBody @Valid FlashcardDTO flashcardDTO) {
        return flashcardService.createNewCard(flashcardDTO);
    }

    @GetMapping
    public List<FlashcardDTO> listAllCards() {
        return flashcardService.listAllCards();
    }

    @GetMapping("/{id}")
    public FlashcardDTO findCardById(@PathVariable Long id) throws CardNotFoundException {
        return flashcardService.findCardsById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCardById(@PathVariable Long id) throws CardNotFoundException {
        flashcardService.deleteCardById(id);
    }

    @PostMapping("/{id}")
    public MessageDTO updateCardById(Long id, @RequestBody @Valid FlashcardDTO flashcardDTO) throws CardNotFoundException {
        return flashcardService.updateCardById(id, flashcardDTO);
    }


}
