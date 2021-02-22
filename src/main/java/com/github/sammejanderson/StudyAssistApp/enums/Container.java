package com.github.sammejanderson.StudyAssistApp.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Container {
    DAY("day"),
    TWODAYS("two days"),
    WEEK("week"),
    TWOWEEKS("two weeks"),
    MONTH("month"),
    RETIRED("retired");

    public String description;
}
