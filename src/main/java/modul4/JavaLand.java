package modul4;

import java.util.Scanner;

public class JavaLand {

    public static void main(String[] args) {
        JavaLand portoRechner = new JavaLand();

        System.out.println("Geben Sie das Gewicht ein: ");
        int gewicht = new Scanner(System.in).nextInt();
        if (portoRechner.berechnePorto(gewicht) >= 1000) {
            System.out.println("Sendung wird als Paket oder Päckchen versendet.");
        } else {
            System.out.println("Sie müssen " + portoRechner.berechnePorto(gewicht) + "€ Porto/Versand bezahlen");
        }
    }

    public double berechnePorto(int gewicht) {
        if (gewicht > 0 && gewicht <= 20) {
            return 1;
        } else if (gewicht <= 50) {
            return 1.7;
        } else if (gewicht <= 100) {
            return 2.4;
        } else if (gewicht <= 250) {
            return 3.2;
        } else if (gewicht <= 500) {
            return 4;
        } else if (gewicht <= 1000) {
            return 4.8;
        } else {
            return 0;
        }
    }
}
