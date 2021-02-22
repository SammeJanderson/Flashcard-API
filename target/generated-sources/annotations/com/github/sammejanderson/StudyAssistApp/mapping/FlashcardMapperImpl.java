package com.github.sammejanderson.StudyAssistApp.mapping;

import com.github.sammejanderson.StudyAssistApp.dto.request.FlashcardDTO;
import com.github.sammejanderson.StudyAssistApp.entity.Flashcard;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-22T13:43:04-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
public class FlashcardMapperImpl implements FlashcardMapper {

    @Override
    public Flashcard toModel(FlashcardDTO flashcardDTO) {
        if ( flashcardDTO == null ) {
            return null;
        }

        Flashcard flashcard = new Flashcard();

        flashcard.setId( flashcardDTO.getId() );
        flashcard.setFront( flashcardDTO.getFront() );
        flashcard.setVerse( flashcardDTO.getVerse() );
        flashcard.setContainer( flashcardDTO.getContainer() );

        return flashcard;
    }

    @Override
    public FlashcardDTO toDTO(Flashcard flashcard) {
        if ( flashcard == null ) {
            return null;
        }

        FlashcardDTO flashcardDTO = new FlashcardDTO();

        flashcardDTO.setId( flashcard.getId() );
        flashcardDTO.setFront( flashcard.getFront() );
        flashcardDTO.setVerse( flashcard.getVerse() );
        flashcardDTO.setContainer( flashcard.getContainer() );

        return flashcardDTO;
    }
}
