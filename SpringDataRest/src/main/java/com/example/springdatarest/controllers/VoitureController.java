package com.example.springdatarest.controllers;

import com.example.springdatarest.model.Voiture;
import com.example.springdatarest.repository.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoitureController {

    @Autowired
    private VoitureRepo voitureRepo;

    @RequestMapping("/voitures")
    public Iterable<Voiture> getVoitures(){
        return voitureRepo.findAll();
    }
}
