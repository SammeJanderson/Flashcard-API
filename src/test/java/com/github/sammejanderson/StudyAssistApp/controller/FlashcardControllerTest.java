package com.github.sammejanderson.StudyAssistApp.controller;

import com.github.sammejanderson.StudyAssistApp.exception.ContainerDoesNotExists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
class FlashcardControllerTest {

    @Autowired
    private FlashcardController flashcardController;

    @Test
    void contextLoads() throws Exception {
        assertThat(flashcardController).isNotNull();
    }

    @Test
    void createNewCard() throws ContainerDoesNotExists {
    }

    @Test
    void listAllCards() throws Exception {
    }

    @Test
    void findCardById() {
    }

    @Test
    void getByContainer() {
    }

    @Test
    void deleteCardById() {
    }

    @Test
    void updateCardById() {
    }

    @Test
    void updateCardContainer() {
    }
}