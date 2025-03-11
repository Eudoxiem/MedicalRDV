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
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "DateRendez-vous")
    private Date dateAppointment;
    @Column(nullable = false, name = "Motif")
    private String reason;
    @Column(nullable = false, name = "Statut")
    private String status;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patients patient;

    @ManyToOne
    @JoinColumn(name = "docteur_id")
    private Doctors docteur;

    public Appointment(Date dateAppointment, String reason, String status, Patients patient, Doctors docteur) {
        this.dateAppointment = dateAppointment;
        this.reason = reason;
        this.status = status;
        this.patient = patient;
        this.docteur = docteur;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateAppointment() {
        return this.dateAppointment;
    }

    public void setDateAppointment(Date dateAppointment) {
        this.dateAppointment = dateAppointment;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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
