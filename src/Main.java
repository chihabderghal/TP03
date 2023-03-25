import Programme.*;
import Entities.*;

import static Entities.Passager.getNombrePassagers;
import static Programme.Reservation.getNombreReserv;
import static Programme.Vol.getNombreTotalVol;

public class Main {
    public static void main(String[] args) {

        Pilote p1 = new Pilote("b4st3123", "Chihab Eddine", 1024);
        Pilote p2 = new Pilote("c5uiol3r", "Mouad", 522);

        Avion a1 = new Avion("Boeing", "767", 500, 2002);
        Avion a2 = new Avion("Cessna", "Cessna 140", 10, 1990);

        Passager passager1 = new Passager("222245566", "Boulmdayes", "Nedjmou", "Nedjmou25@gmail.com", "000 00 00 00");
        Passager passager2 = new Passager("222167954", "Blabla", "Nabil", "nabilpro@gmail.com", "000 00 00 00");
        Passager passager3 = new Passager("222207479", "Korsi", "Hadil", "hadil.korsi@gmail.com", "000 00 00 00");
        Passager passager4 = new Passager("222364295", "Tabla", "maria", "maria-france@gmail.com", "000 00 00 00");

        Vol v1 = new Vol("boinf3345", a1, p1, "Constantine", "Marseille", "2023/10/11");
        Vol v2 = new Vol("djfo443f2", a2, p2, "Alger", "Paris", "2023/12/4");
        Vol v3 = new Vol("chero4452", a1, p2,"Oran", "London", "2023/4/14");

        Reservation r1 = new Reservation(3445, passager2, v2, "CONFIRMER");
        Reservation r2 = new Reservation(4453, passager1, v1, "CONFIRMER");
        Reservation r3 = new Reservation(2233, passager3, v3, "CONFIRMER");
        Reservation r4 = new Reservation(8967, passager4, v2, "CONFIRMER");
        Reservation r5 = new Reservation(2373, passager2, v1, "ATTENDE");
        Reservation r6 = new Reservation(1363, passager1, v3, "ATTENDE");

        int nombreTotalDesPassagers = getNombrePassagers() + getNombreReserv();
        System.out.println("Le nombre totale des passagers : " + nombreTotalDesPassagers);

        System.out.println("Le nombre totale de vols : " + getNombreTotalVol());

    }
}
