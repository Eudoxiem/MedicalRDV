package com.example.medicalrdv.model;


import java.sql.Date;

import javax.management.relation.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;




@Entity
@Table(name = "Patients")
public class Patients extends Users {
    
    @Column(nullable = false, name = "NuméroDeSecuriteSociale")
    private String nss;

    
    public Patients(String name, String firstName, String address, String email, String password, Date birth,
            Role role) {
        super(name, firstName, address, email, password, birth, role);
        this.nss=nss;
    }

 
    

   
}
