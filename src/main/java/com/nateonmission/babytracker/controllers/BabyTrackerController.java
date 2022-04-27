package com.nateonmission.babytracker.controllers;


import com.nateonmission.babytracker.services.BabyTrackerServices;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1/")
public class BabyTrackerController {
    private static final Logger LOGGER = Logger.getLogger(BabyTrackerController.class.getName());


//    private BabyTrackerServices babyTrackerServices;
//    @Autowired
//    public void setChurchManagerServices(BabyTrackerServices babyTrackerServices) {
//        this.babyTrackerServices = babyTrackerServices;
//    }

    @Bean
    public BabyTrackerServices babyTrackerServices() { return new BabyTrackerServices(); }
    BabyTrackerServices babyTrackerServices = babyTrackerServices();

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
    ModelMapper modelMapper = modelMapper();
















}
