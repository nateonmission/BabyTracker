package com.nateonmission.babytracker.models;

import java.util.Set;

public class User {
    Long id;

    String firstName;

    String lastName;

    String email;

    String passwordHash;

    Set<Baby> babies;

    Boolean isDeleted;
}
