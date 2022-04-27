package com.nateonmission.babytracker.models;

import java.time.LocalDateTime;

public class Feeding {
    Long id;

    Baby baby;

    String content;

    Long volume;

    String unit;

    LocalDateTime dateTime;

    String comments;
}
