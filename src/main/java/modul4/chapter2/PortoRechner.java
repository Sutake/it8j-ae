package modul4.chapter2;

import java.util.Scanner;

public class PortoRechner {

    public static void main(String[] args) {
        PortoRechner portoRechner = new PortoRechner();

        System.out.println("Geben Sie die Gesamtsumme ein. Wir werden Ihnen die Porto- und Versandkosten berechnen: ");
        int auftragssumme = new Scanner(System.in).nextInt();
        System.out.println("Sie müssen " + portoRechner.berechneKosten(auftragssumme) + "€ Porto/Versand bezahlen");
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
}