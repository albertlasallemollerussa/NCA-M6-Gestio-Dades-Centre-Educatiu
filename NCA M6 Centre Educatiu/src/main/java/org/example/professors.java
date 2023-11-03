package org.example;

import java.io.Serializable;

public class professors implements Serializable {

    String nom;
    int id;
    int telefon;

    String adreça;

    int idCurs;

    public professors() {
    }

    public int getIdCurs() {
        return idCurs;
    }

    public void setIdCurs(int idCurs) {
        this.idCurs = idCurs;
    }

    public professors(String nom, int id, int telefon, String adreça, int idCurs) {
        this.nom = nom;
        this.id = id;
        this.telefon = telefon;
        this.adreça = adreça;
        this.idCurs = idCurs;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public int getTelefon() {
        return telefon;
    }

    public String getAdreça() {
        return adreça;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    @Override
    public String toString() {
        return "professors{" +
                "nom='" + nom + '\'' +
                ", id=" + id +
                ", telefon=" + telefon +
                ", adreça='" + adreça + '\'' +
                ", idCurs=" + idCurs +
                '}';
    }
}
