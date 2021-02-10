package com.github.sammejanderson.StudyAssistApp.mapping;

import com.github.sammejanderson.StudyAssistApp.dto.FlashcardDTO;
import com.github.sammejanderson.StudyAssistApp.entity.Flashcard;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FlashcardMapper {

    FlashcardMapper INSTANCE = Mappers.getMapper(FlashcardMapper.class);

    Flashcard toModel(FlashcardDTO flashcardDTO);

    FlashcardDTO toDTO(Flashcard flashcard);

}
