package modul4;

import java.util.Scanner;

public class VersandRechner {

    public static void main(String[] args) {
        VersandRechner portoRechner = new VersandRechner();

        System.out.println("Geben Sie die Gesamtsumme ein. Wir werden Ihnen die Porto- und Versandkosten berechnen: ");
        int auftragssumme = new Scanner(System.in).nextInt();
        System.out.println("Sie müssen " + portoRechner.berechneKosten(auftragssumme) + "€ Porto/Versand bezahlen");
/*
        System.out.println("Geben Sie das Gewic ");
        int gewicht = new Scanner(System.in).nextInt();*/


    }

    public double berechneKosten(double auftragsumme) {
        if (auftragsumme < 100) {
            return 5.5;
        } else if (auftragsumme >= 100 && auftragsumme < 200) {
            return 3;
        } else {
            return 0;
        }
    }
/*
    public double berechnePorto(int gewicht) {
        if (gewicht > 0 && gewicht < 20) {
            return 1;
        } else if (gewicht >= 20 && gewicht < 50) {
            return 1.7;
        } else if (gewicht >= 50 && gewicht < 100) {
            return 2.4;
        } else if (gewicht >= 100 && gewicht < 250) {
            return 3.2;
        } else if (gewicht >= 250 && gewicht < 500) {
            return 4;
        } else if (gewicht >= 500 && gewicht < 1000) {
            return 4.8;
        } else {
            return 0;
        }
    }*/
}