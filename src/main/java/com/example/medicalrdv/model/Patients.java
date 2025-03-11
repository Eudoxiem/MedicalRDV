package com.example.medicalrdv.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import javax.management.relation.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Patients")
public class Patients extends Users {

    @Column(unique = true, name = "NuméroDeSécuritéSocial")
    private String socialSecurityNumber;
    @Column(name = "Date&HeureEnregistrement")
    private Timestamp registrationTime;
    

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Appointment> rendezVous;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Prescription> prescriptions;

    public Patients(String name, String firstName, String address, String email, String password, Date birth,
            String profilePicture, String socialSecurityNumber, Timestamp registrationTime) {
        super(name, firstName, address, email, password, birth, profilePicture, Role.PATIENT);
        this.socialSecurityNumber = socialSecurityNumber;
        this.registrationTime = registrationTime;
    }

    public String getNss() {
        return this.socialSecurityNumber;
    }

    public void setNss(String nss) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Timestamp getRegistrationTime() {
        return this.registrationTime;
    }

    public void setRegistrationTime(Timestamp registrationTime) {
        this.registrationTime = registrationTime;
    }

}
