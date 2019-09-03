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
}
