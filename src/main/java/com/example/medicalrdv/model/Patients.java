package com.example.medicalrdv.model;

import java.sql.Date;

import jakarta.persistence.Entity;




@Entity
public class Patients extends Users {

    public Patients(String nom, String prénom, String edresse, String email, String password, Date dateNaiss) {
        super(nom, prénom, edresse, email, password, dateNaiss);
        //TODO Auto-generated constructor stub
    }

    private String numeroSecuriteSociale;
    private String dateNaissance;


    public String getNumeroSecuriteSociale() {
        return this.numeroSecuriteSociale;
    }

    public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
        this.numeroSecuriteSociale = numeroSecuriteSociale;
    }

    public String getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }


}
