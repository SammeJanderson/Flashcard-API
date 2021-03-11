package com.github.sammejanderson.StudyAssistApp.utils;

import com.github.sammejanderson.StudyAssistApp.enums.Container;
import com.github.sammejanderson.StudyAssistApp.exception.ContainerDoesNotExists;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Component
public class TimeManager {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    //esse metodo converte os conteiner para os numero respectivo de dias
    public static Integer convertContainerToNumOfDays(Container container) throws ContainerDoesNotExists {
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


    public static String formatTime(LocalDate date){
        return formatter.format(date);
    }

    public static String findNextDate(String s, Container container) throws ContainerDoesNotExists {
        LocalDate date = LocalDate.parse(s,formatter)
                .plus(convertContainerToNumOfDays(container), ChronoUnit.DAYS);
        return formatTime(date);
    }





}
