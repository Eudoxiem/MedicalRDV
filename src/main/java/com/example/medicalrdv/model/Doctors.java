package com.example.medicalrdv.model;

import java.sql.Date;
import java.util.List;

import javax.management.relation.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Docteurs")
public class Doctors  extends Users{


    @Column(name = "Spécialité")
    private String speciality;
    @Column(name = "NuméroDeLicence", nullable=false, unique = true)
    private String licenseNumber;
    
     @OneToMany(mappedBy = "docteur", cascade = CascadeType.ALL)
    private List<Appointment> rendezVous;

    @OneToMany(mappedBy = "docteur", cascade = CascadeType.ALL)
    private List<Prescription> prescriptions;

    
    public Doctors(String name, String firstName, String address, String email, String password, Date birth,
            String profilePicture,String speciality, String licenseNumber ) {
        super(name, firstName, address, email, password, birth, profilePicture, Role.DOCTOR);
        this.speciality=speciality;
        this.licenseNumber=licenseNumber;
        
    }


    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
        
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

}
