package com.example.medicalrdv.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    @Column(nullable = false)
    private String drugs;
    @Column(nullable = false)
    private String dosage;
    @Column(nullable = false)
    private Date prescriptionDate;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patients patient;

    @ManyToOne
    @JoinColumn(name = "docteur_id")
    private Doctors docteur;

    public Prescription(String drugs, String dosage, Date prescriptionDate, Doctors docteur, Patients patient) {
        this.drugs = drugs;
        this.dosage = dosage;
        this.prescriptionDate = prescriptionDate;
        this.patient=patient;
        this.docteur=docteur;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDrugs() {
        return this.drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
    }

    public String getDosage() {
        return this.dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public Date getPrescriptionDate() {
        return this.prescriptionDate;
    }

    public void setPrescriptionDate(Date prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    public Patients getPatient() {
        return this.patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    public Doctors getDocteur() {
        return this.docteur;
    }

    public void setDocteur(Doctors docteur) {
        this.docteur = docteur;
    }

    
}
