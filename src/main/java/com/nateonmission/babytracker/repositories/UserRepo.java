package com.nateonmission.babytracker.repositories;

import com.nateonmission.babytracker.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<User, Long> {

}
