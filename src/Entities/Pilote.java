package Entities;

public class Pilote {

    private final String id;
    private String nom;
    private int heuresVol;

    public Pilote (String id, String nom, int heuresVol) {
        this.id = id;
        this.nom = nom;
        this.heuresVol = heuresVol;
    }

    public String getId () {
        return id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setHeuresVol(int heuresVol) {
        this.heuresVol = heuresVol;
    }

    public int getHeuresVol() {
        return heuresVol;
    }
}
