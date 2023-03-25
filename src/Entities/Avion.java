package Entities;

import java.lang.constant.Constable;

public class Avion {

    private final String marque, modele;
    private final int anne;
    private int capacite;

    
    public Avion(String marque, String modele, int capacite, int anne) {
        this.marque = marque;
        this.modele = modele;
        this.capacite = capacite;
        this.anne = anne;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getAnne() {
        return anne;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
