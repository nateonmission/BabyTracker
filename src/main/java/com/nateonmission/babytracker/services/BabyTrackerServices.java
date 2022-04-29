package com.nateonmission.babytracker.services;

import com.nateonmission.babytracker.controllers.BabyTrackerController;
import com.nateonmission.babytracker.dtos.StatusDTO;
import com.nateonmission.babytracker.models.Status;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

public class BabyTrackerServices {
    private static final Logger LOGGER = Logger.getLogger(BabyTrackerServices.class.getName());

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
    ModelMapper mapper = modelMapper();

    // SERVICES FOR ROUTES IN CONTROLLER
    public StatusDTO isAlive() {
        LOGGER.info("calling isAlive method ==>");
        Status current = new Status();
        current.setStatus(true);
        return mapper.map(current, StatusDTO.class);
    }


    




}
