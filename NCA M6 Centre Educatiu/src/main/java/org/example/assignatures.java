package org.example;

import java.io.Serializable;

public class assignatures implements Serializable {

    int DuradaHores;

    String nom;

    int idCurs;

    public int getIdCurs() {
        return idCurs;
    }

    public void setIdCurs(int idCurs) {
        this.idCurs = idCurs;
    }

    public assignatures() {
    }

    public assignatures(int duradaHores, String nom, int idCurs) {
        DuradaHores = duradaHores;
        this.nom = nom;
        this.idCurs = idCurs;
    }

    public int getDuradaHores() {
        return DuradaHores;
    }

    public String getNom() {
        return nom;
    }

    public void setDuradaHores(int duradaHores) {
        DuradaHores = duradaHores;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "assignatures{" +
                "DuradaHores=" + DuradaHores +
                ", nom='" + nom + '\'' +
                ", idCurs=" + idCurs +
                '}';
    }
}
