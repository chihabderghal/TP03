package Entities;

public class Passager {

    private String numPassport, nom, prenom, email, tel;
    private static int nombrePassagers = 0;

    public Passager(String numPassport, String nom, String prenom, String email, String tel) {
        this.numPassport = numPassport;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        nombrePassagers++;
    }

    public void setNumPassport(String numPassport) {
        this.numPassport = numPassport;
    }
    public String getNumPassport() {
        return numPassport;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }

    public static int getNombrePassagers() {
        return nombrePassagers;
    }
}
