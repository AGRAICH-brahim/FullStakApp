package com.example.springdatarest;

import com.example.springdatarest.model.Proprietaire;
import com.example.springdatarest.model.Voiture;
import com.example.springdatarest.repository.ProprietaireRepo;
import com.example.springdatarest.repository.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataRestApplication {
    @Autowired
    ProprietaireRepo proprietaireRepo;
    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestApplication.class, args);
    }
}
