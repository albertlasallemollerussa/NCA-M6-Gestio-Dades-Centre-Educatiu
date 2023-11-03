package org.example;

import java.io.Serializable;

public class curs implements Serializable {

    int id;
    int preu;

    String NomCurs;

    String AssignaturesOptatives;

    public curs() {
    }

    public curs(int id, int preu, String nomCurs, String assignaturesOptatives) {
        this.id = id;
        this.preu = preu;
        NomCurs = nomCurs;
        AssignaturesOptatives = assignaturesOptatives;
    }

    public int getId() {
        return id;
    }

    public int getPreu() {
        return preu;
    }

    public String getNomCurs() {
        return NomCurs;
    }

    public String getAssignaturesOptatives() {
        return AssignaturesOptatives;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public void setNomCurs(String nomCurs) {
        NomCurs = nomCurs;
    }

    public void setAssignaturesOptatives(String assignaturesOptatives) {
        AssignaturesOptatives = assignaturesOptatives;
    }

    @Override
    public String toString() {
        return "curs{" +
                "id=" + id +
                ", preu=" + preu +
                ", NomCurs='" + NomCurs + '\'' +
                ", AssignaturesOptatives='" + AssignaturesOptatives + '\'' +
                '}';
    }
}
