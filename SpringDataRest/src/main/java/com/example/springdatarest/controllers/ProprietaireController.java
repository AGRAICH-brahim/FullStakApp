package com.example.springdatarest.controllers;


import com.example.springdatarest.model.Proprietaire;
import com.example.springdatarest.model.Voiture;
import com.example.springdatarest.repository.ProprietaireRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProprietaireController {

    @Autowired
    ProprietaireRepo proprietaireRepo;

    @RequestMapping("/proprietaires")
    public Iterable<Proprietaire> getProprietaires() {
        return proprietaireRepo.findAll();
    }

}
