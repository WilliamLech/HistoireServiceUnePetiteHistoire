package com.java.histoire.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Histoire")
public class Histoire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="titre")
    private String titre;

    @Column(name="description")
    private String description;

    @Column(name="dateuploade")
    private LocalDate dateUpload;

    @Column(name="datemiseenligne")
    private LocalDate dateMiseEnLigne;

    @Column(name="chemin")
    private String chemin;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateUpload() {
        return dateUpload;
    }

    public void setDateUpload(LocalDate dateUpload) {
        this.dateUpload = dateUpload;
    }

    public LocalDate getDateMiseEnLigne() {
        return dateMiseEnLigne;
    }

    public void setDateMiseEnLigne(LocalDate dateMiseEnLigne) {
        this.dateMiseEnLigne = dateMiseEnLigne;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }
}
