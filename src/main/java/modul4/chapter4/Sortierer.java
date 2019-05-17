package modul4.chapter4;

public class Sortierer {

    public int[] insertNumberInArray(int a[], int number) {

        int rememberIndex = 0;
        int[] clonedA = a.clone();
        for (int i = 0; i < a.length - 1; i++) {
            if (number > a[i] && number < a[i + 1]) {
                a[i + 1] = number;
                rememberIndex = i + 2;
            }
        }

        for (int i = rememberIndex; i < a.length; i++) {
            a[i] = clonedA[i - 1];
        }

        return a;
    }
}
