package org.example;

import java.io.Serializable;

public class assignatures implements Serializable {

    int DuradaHores;

    String nom;

    public assignatures() {
    }

    public assignatures(int duradaHores, String nom) {
        DuradaHores = duradaHores;
        this.nom = nom;
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
                '}';
    }
}
