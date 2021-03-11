package com.github.sammejanderson.StudyAssistApp.dto.request;

import com.github.sammejanderson.StudyAssistApp.enums.Container;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FlashcardDTO {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String front;

    private String verse;

    private Container container;

    private String lastRevision;

    private String nextRevision;



}

