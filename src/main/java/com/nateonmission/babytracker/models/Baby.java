package com.nateonmission.babytracker.models;

import java.time.LocalDateTime;
import java.util.Set;

public class Baby {
    Long id;

    String firstName;

    String middleName;

    String lastName;

    LocalDateTime dateOfBirth;

    String comments;

    Set<CheckUp> checkUps;

    Set<DiaperChange> diaperChanges;

    Set<Feeding> feedings;

    Boolean isDeleted;
}
