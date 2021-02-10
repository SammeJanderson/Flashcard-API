package com.github.sammejanderson.StudyAssistApp.entity;

import com.github.sammejanderson.StudyAssistApp.enums.Container;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Flashcard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String front;

    @Column(nullable = false)
    private String verse;

    @Column(nullable = false)
    private Container container;
}
