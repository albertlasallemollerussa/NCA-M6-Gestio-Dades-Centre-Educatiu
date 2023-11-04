package org.example;

import java.io.Serializable;

public class alumnes implements Serializable {

    int telefon;
    String nom;
    String adreça;
    int edat;
    int id;
    int telefonTutorLegal;

    int idcurs;


    public alumnes() {
    }

    public alumnes(int telefon, String nom, String adreça, int edat, int id, int telefonTutorLegal, int idcurs) {
        this.telefon = telefon;
        this.nom = nom;
        this.adreça = adreça;
        this.edat = edat;
        this.id = id;
        this.telefonTutorLegal = telefonTutorLegal;
        this.idcurs = idcurs;
    }

    public int getIdcurs() {
        return idcurs;
    }

    public void setIdcurs(int idcurs) {
        this.idcurs = idcurs;
    }

    public int getTelefon() {
        return telefon;
    }

    public String getNom() {
        return nom;
    }

    public String getAdreça() {
        return adreça;
    }

    public int getEdat() {
        return edat;
    }

    public int getId() {
        return id;
    }

    public int getTelefonTutorLegal() {
        return telefonTutorLegal;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTelefonTutorLegal(int telefonTutorLegal) {
        this.telefonTutorLegal = telefonTutorLegal;
    }

    @Override
    public String toString() {
        return "alumnes{" +
                "telefon=" + telefon +
                ", nom='" + nom + '\'' +
                ", adreça='" + adreça + '\'' +
                ", edat=" + edat +
                ", id=" + id +
                ", telefonTutorLegal=" + telefonTutorLegal +
                ", idcurs=" + idcurs +
                '}';
    }
}
