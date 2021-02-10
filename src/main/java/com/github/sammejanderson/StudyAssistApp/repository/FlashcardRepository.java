package com.github.sammejanderson.StudyAssistApp.repository;

import com.github.sammejanderson.StudyAssistApp.entity.Flashcard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashcardRepository extends JpaRepository<Flashcard, Long> {
}
