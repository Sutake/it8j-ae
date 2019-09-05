package modul4.chapter4;

import java.util.Random;
import java.util.Scanner;

public class LottoExecute {
    public static void main(String[] args) {
        int[] randomLottoNumbers = new int[6];
        for (int i = 0; i < randomLottoNumbers.length - 1; i++) {
            randomLottoNumbers[i] = new Random().nextInt(49);
        }
        int[] inputNumbers = new int[6];
        for (int i = 0; i <= inputNumbers.length - 1; i++) {
            System.out.println("Bitte geben Sie die " + (i + 1) + ". Lottozahl ein.");
            inputNumbers[i] = new Scanner(System.in).nextInt();
        }
        Lotto lotto = new Lotto(randomLottoNumbers);
        System.out.println(lotto.calcResult(inputNumbers));
    }
}