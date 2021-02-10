package com.github.sammejanderson.StudyAssistApp.dto.request;

import com.github.sammejanderson.StudyAssistApp.enums.Container;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FlashcardDTO {

    private Long id;

    private String front;

    private String verse;

    private Container container;

}
