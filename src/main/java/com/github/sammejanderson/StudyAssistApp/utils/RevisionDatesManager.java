package com.github.sammejanderson.StudyAssistApp.utils;

import com.github.sammejanderson.StudyAssistApp.enums.Container;
import com.github.sammejanderson.StudyAssistApp.exception.ContainerDoesNotExists;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class RevisionDatesManager {

    //esse metodo converte os conteiner para os numero respectivo de dias
    public Integer convertContainerToNumOfDays(Container container) throws ContainerDoesNotExists {
        switch (container) {

            case DAY -> {
                return 1;
            }
            case TWODAYS -> {
                return 2;
            }
            case WEEK -> {
                return 7;
            }
            case TWOWEEKS -> {
                return 14;
            }
            case MONTH -> {
                return 30;
            }
            case RETIRED -> {
                return 365;
            }
        }
        throw new ContainerDoesNotExists();
    }

    public String formatInstantToString(Instant instant) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                        .withZone(ZoneId.systemDefault());

        return formatter.format(instant);
    }

    public Instant formatStringToInstant(String s) {
        return LocalDateTime.parse(s, DateTimeFormatter.ofPattern("dd/MM/yy hh:mm")).atZone(ZoneId.of("Brazil/Brasilia")).toInstant();
    }


    public String findNextRevisionDate(String lastRevision, Container container) throws ContainerDoesNotExists {
        Integer days = convertContainerToNumOfDays(container);
        Instant n = formatStringToInstant(lastRevision).plus(days, ChronoUnit.DAYS);
        return formatInstantToString(n);
    }



    //TODO: metodo para comparar datas retorna true or false
}
