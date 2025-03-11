package com.example.medicalrdv.model;

import java.sql.Date;

import javax.management.relation.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import lombok.Data;




@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name= "Utilisateurs")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "Nom")
    private String name;

    @Column(nullable = false, name = "Prénom")
    private String firstName;

    @Column(nullable = false, name = "Adresse")
    private String address;

    @Column(nullable = false, name = "E-mail", unique = true)
    private String email;

    @Column(nullable = false, name = "MotDePasse")
    private String password;

    @Column(nullable = false, name = "DateDeNaissance")
    private Date birth;

    @Column(nullable = true, name = "PhotoProfil")
    private String profilePicture;


    @Enumerated(EnumType.STRING)
    @Column(name = "Role")
    private Role role;


    public Users(String name, String firstName, String address, String email, String password, Date birth,
            String profilePicture, Role role) {
        this.name = name;
        this.firstName = firstName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.birth = birth;
        this.profilePicture = profilePicture;
        this.role = role;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Date getBirth() {
        return this.birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getProfilePicture() {
        return this.profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }    
}
