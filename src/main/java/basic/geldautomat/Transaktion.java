package basic.geldautomat;

import java.util.Scanner;

public class Transaktion {
    private static void printInputHint() {
        System.out.println("------------------------------------------");
        System.out.println("Geben Sie die 1 um Geld einzuzahlen");
        System.out.println("Geben Sie die 2 ein um Geld abzuheben");
        System.out.println("Geben Sie die 0 ein das Programm zu beenden");
    }

    public static void main(String[] args) {

        Konto konto = new Konto();
        konto.setKontostand(2000);
        System.out.println("Sie besitzen " + konto.getKontostand() + "€ auf Ihrem Konto.");
        printInputHint();

        int userInput = new Scanner(System.in).nextInt();

        while (userInput != 0) {
            if (userInput == 1) {
                System.out.println("Wie viel Geld möchten Sie einzahlen?");
                double inputMoney = new Scanner(System.in).nextDouble();
                if (inputMoney > 0) {
                    konto.einzahlen(inputMoney);
                    System.out.println("Sie haben " + konto.getKontostand() + "€");
                } else {
                    System.out.println("Sie können nicht negativ einzahlen.");
                }

            } else if (userInput == 2) {
                System.out.println("Wie viel Geld möchten Sie abheben?");
                double outputMoney = new Scanner(System.in).nextDouble();
                if (konto.auszahlen(outputMoney)) {
                    if (outputMoney > 0) {
                        System.out.println("Sie hatten " + konto.getKontostand() + "€. Davon werden " + outputMoney + "€ abgezogen. Nun haben Sie noch " + (konto.getKontostand() - outputMoney) + "€");
                    } else {
                        System.out.println("Sie können nicht negativ abheben.");
                    }
                } else {
                    System.out.println("Da Sie nur " + konto.getKontostand() + "€ haben, können Sie nicht " + outputMoney + "€ abheben");
                }
            }
            printInputHint();
            userInput = new Scanner(System.in).nextInt();
        }
    }
}