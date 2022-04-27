package com.nateonmission.babytracker.repositories;

import com.nateonmission.babytracker.models.DiaperChange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaperChangeRepo  extends JpaRepository<DiaperChange, Long> {
}
