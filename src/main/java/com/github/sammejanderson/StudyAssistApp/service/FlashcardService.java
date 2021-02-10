package com.github.sammejanderson.StudyAssistApp.service;

import com.github.sammejanderson.StudyAssistApp.dto.request.FlashcardDTO;
import com.github.sammejanderson.StudyAssistApp.dto.response.MessageDTO;
import com.github.sammejanderson.StudyAssistApp.entity.Flashcard;
import com.github.sammejanderson.StudyAssistApp.exception.CardNotFoundException;
import com.github.sammejanderson.StudyAssistApp.mapping.FlashcardMapper;
import com.github.sammejanderson.StudyAssistApp.repository.FlashcardRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class FlashcardService {

    private final FlashcardMapper flashcardMapper;
    private FlashcardRepository repository;


    public MessageDTO createNewCard(FlashcardDTO flashcardDTO) {
        Flashcard cardToSave = flashcardMapper.toModel(flashcardDTO);

        Flashcard savedCard = repository.save(cardToSave);
        return CreateMessageDTO("Created card with Id: ", savedCard.getId());
    }


    public List<FlashcardDTO> listAllCards() {
        List<Flashcard> allCards = repository.findAll();
        return allCards.stream().map(flashcardMapper::toDTO).collect(Collectors.toList());
    }

    public FlashcardDTO findCardsById(Long id) throws CardNotFoundException {
        Flashcard card = verifyIfExists(id);
        return flashcardMapper.toDTO(card);
    }


    public void deleteCardById(Long id) throws CardNotFoundException {
        verifyIfExists(id);
        repository.deleteById(id);
    }

    public MessageDTO updateCardById(Long id, FlashcardDTO flashcardDTO) throws CardNotFoundException{
        verifyIfExists(id);
        Flashcard cardToUpdate =  flashcardMapper.toModel(flashcardDTO);

        Flashcard updatedCard = repository.save(cardToUpdate);
        return CreateMessageDTO("Updated Card with Id: ",updatedCard.getId());

    }


    private MessageDTO CreateMessageDTO(String message, Long id) {
        return MessageDTO.builder().message(message + id).build();
    }


    private Flashcard verifyIfExists(Long id) throws CardNotFoundException {
        return repository.findById(id).orElseThrow(() -> new CardNotFoundException(id));

    }
}
