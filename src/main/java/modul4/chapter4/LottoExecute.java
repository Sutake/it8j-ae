package modul4.chapter4;

import java.util.Random;
import java.util.Scanner;

public class LottoExecute {
    public static void main(String[] args) {
        Random r = new Random();


        int[] randomLottoNumbers = new int[6];
        for (int i = 0; i < randomLottoNumbers.length; i++) {
            randomLottoNumbers[i] = new Random().nextInt(49);
        }
        int[] inputNumbers = new int[6];
        for (int i = 0; i < inputNumbers.length ; i++) {
            System.out.println("Bitte geben Sie die " + (i + 1) + ". Lottozahl ein.");
            inputNumbers[i] = new Scanner(System.in).nextInt();
        }

        Lotto lotto = new Lotto(randomLottoNumbers);

        if (lotto.calcResult(inputNumbers) == 1) {
            System.out.println(" Sie haben eine richtige Zahlen");
        } else {
            System.out.println(" Sie haben " + lotto.calcResult(inputNumbers) + " richtige Zahlen");
        }

    }
}