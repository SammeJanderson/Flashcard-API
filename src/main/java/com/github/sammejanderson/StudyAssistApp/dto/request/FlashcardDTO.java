package com.github.sammejanderson.StudyAssistApp.dto.request;

import com.github.sammejanderson.StudyAssistApp.enums.Container;
import com.github.sammejanderson.StudyAssistApp.exception.ContainerDoesNotExists;
import com.github.sammejanderson.StudyAssistApp.utils.TimeManager;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FlashcardDTO {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String front;

    private String verse;

    private Container container = Container.DAY;
    ;

    private String lastRevision = TimeManager.formatTime(LocalDate.now());
    ;

    private String nextRevision;

    {
        try {
            nextRevision = TimeManager.findNextDate(lastRevision, container);
        } catch (ContainerDoesNotExists containerDoesNotExists) {
            containerDoesNotExists.printStackTrace();
        }
    }

    ;


    /* esse cosntrutor só serve pra usar o dataloadder*/
    //TODO: apagar esse contructor quando não for mais nescessário
    public FlashcardDTO(String front, String verse) throws ContainerDoesNotExists {
        this.front = front;
        this.verse = verse;
        this.container = Container.DAY;
        this.lastRevision = TimeManager.formatTime(LocalDate.now());
        this.nextRevision = TimeManager.findNextDate(lastRevision, container);
    }


}


