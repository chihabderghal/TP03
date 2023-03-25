package Programme;

import Entities.*;

public class Vol {

    private final String idVol;
    private Avion avion;
    private Pilote pilote;
    private String villeDep, villArv, date;

    private static int nombreTotalVol = 0;

    public Vol(String idVol, Avion avion, Pilote pilote, String villeDep, String villArv, String date) {
        this.idVol = idVol;
        this.avion = avion;
        this.pilote = pilote;
        this.villeDep = villeDep;
        this.villArv = villArv;
        this.date = date;
        nombreTotalVol++;
    }

    public static int getNombreTotalVol() {
        return nombreTotalVol;
    }

    public String getIdVol() {
        return idVol;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    public String getVilleDep() {
        return villeDep;
    }

    public void setVilleDep(String villeDep) {
        this.villeDep = villeDep;
    }

    public String getVillArv() {
        return villArv;
    }

    public void setVillArv(String villArv) {
        this.villArv = villArv;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}