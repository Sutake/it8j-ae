package modul4.chapter4;

import java.util.Arrays;

public class Sortierer {

    public int[] insertNumberInArray(int[] a, int number) {

        int[] result = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        result[result.length - 1] = number;
        Arrays.sort(result);
        return result;
    }

    public int[] deleteNumberFromArray(int[] a, int number) {
        int[] clonedA = a.clone();
        int rememberIndex = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == number) {
                rememberIndex = i;
            }
        }
        for (int i = rememberIndex; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }

        a[a.length - 1] = 0;
        return a;
    }
}
