package com.nateonmission.babytracker.services;

import com.nateonmission.babytracker.controllers.BabyTrackerController;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

public class BabyTrackerServices {
    private static final Logger LOGGER = Logger.getLogger(BabyTrackerServices.class.getName());

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
    ModelMapper modelMapper = modelMapper();



}
