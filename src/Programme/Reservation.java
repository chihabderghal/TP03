package Programme;

import Entities.Passager;

public class Reservation {
    private int numResrv;
    private static int nombreReserv = 0;
    private final Passager passager;
    private final Vol vol;
    private String etat;

    public Reservation(int numResrv, Passager passager, Vol vol, String etat) {
        this.numResrv = numResrv;
        this.passager = passager;
        this.vol = vol;
        this.etat = etat;
        nombreReserv++;
    }

    public static int getNombreReserv() {
        return nombreReserv;
    }

    public int getNumResrv() {
        return numResrv;
    }

    public void setNumResrv(int numResrv) {
        this.numResrv = numResrv;
    }

    public Passager getPassager() {
        return passager;
    }

    public Vol getVol() {
        return vol;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void annulerReservation() {
        this.etat = "ANNULER";
    }

}
