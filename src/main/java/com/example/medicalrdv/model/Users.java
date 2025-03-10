package com.example.medicalrdv.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Users {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String Prénom;
    private String edresse;
    private String email;
    private String password;
    private Date DateNaiss;
    
    public Users(String nom, String prénom, String edresse, String email, String password, Date dateNaiss) {
        this.nom = nom;
        Prénom = prénom;
        this.edresse = edresse;
        this.email = email;
        this.password = password;
        DateNaiss = dateNaiss;
    }

    

}
