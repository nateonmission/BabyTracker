package com.nateonmission.babytracker.repositories;

import com.nateonmission.babytracker.models.Feeding;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedingRepo  extends JpaRepository<Feeding, Long> {
}
