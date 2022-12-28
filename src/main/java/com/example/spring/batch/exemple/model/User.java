package com.example.spring.batch.exemple.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String nom ;
    private String prenom;
    private String departement;
    private Integer salaire;
    private Date date_Execution;

    public User(Integer id, String nom, String prenom, String departement, Integer salaire, Date date_Execution) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.departement = departement;
        this.salaire = salaire;
        this.date_Execution=date_Execution;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Integer getSalaire() {
        return salaire;
    }

    public void setSalaire(Integer salaire) {
        this.salaire = salaire;
    }

    public Date getDate_Execution() {
        return date_Execution;
    }

    public void setDate_Execution(Date date_Execution) {
        this.date_Execution = date_Execution;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", departement='" + departement + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
