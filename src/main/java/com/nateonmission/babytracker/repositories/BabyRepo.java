package com.nateonmission.babytracker.repositories;

import com.nateonmission.babytracker.models.Baby;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BabyRepo  extends JpaRepository<Baby, Long> {
}
