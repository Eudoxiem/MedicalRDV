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


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return this.Prénom;
    }

    public void setPrénom(String Prénom) {
        this.Prénom = Prénom;
    }

    public String getEdresse() {
        return this.edresse;
    }

    public void setEdresse(String edresse) {
        this.edresse = edresse;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateNaiss() {
        return this.DateNaiss;
    }

    public void setDateNaiss(Date DateNaiss) {
        this.DateNaiss = DateNaiss;
    }
    

}
