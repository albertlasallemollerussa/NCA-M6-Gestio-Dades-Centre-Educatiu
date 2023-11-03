package org.example;

import java.io.Serializable;

public class treballadors implements Serializable {

    String nom;

    int id;

    String adreça;

    int telefon;

    String departament;

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public treballadors() {
    }



    public treballadors(String nom, int id, String adreça, int telefon, String departament) {
        this.nom = nom;
        this.id = id;
        this.adreça = adreça;
        this.telefon = telefon;
        this.departament = departament;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public String getAdreça() {
        return adreça;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "treballadors{" +
                "nom='" + nom + '\'' +
                ", id=" + id +
                ", adreça='" + adreça + '\'' +
                ", telefon=" + telefon +
                ", departament='" + departament + '\'' +
                '}';
    }
}
