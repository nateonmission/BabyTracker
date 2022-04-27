package com.nateonmission.babytracker.repositories;

import com.nateonmission.babytracker.models.CheckUp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckUpRepo  extends JpaRepository<CheckUp, Long> {
}
