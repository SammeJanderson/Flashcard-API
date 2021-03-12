package com.github.sammejanderson.StudyAssistApp.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Container {
    DAY("day", 1),
    TWODAYS("two days", 2),
    WEEK("week", 3),
    TWOWEEKS("two weeks", 4),
    MONTH("month", 5),
    RETIRED("retired", 6);

    public String description;
    public Integer step;
}
