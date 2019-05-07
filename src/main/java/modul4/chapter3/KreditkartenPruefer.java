package modul4.chapter3;

import java.util.Arrays;

public class KreditkartenPruefer {
    public static void main(String[] args) {
        KreditkartenPruefer kreditkartenPruefer1 = new KreditkartenPruefer();
        System.out.println(kreditkartenPruefer1.isValidNumber(2718281828458567L));
        System.out.println(kreditkartenPruefer1.isValidNumber(5475148316641028L));
        System.out.println(kreditkartenPruefer1.isValidNumber(5142358646091710L));
        System.out.println(kreditkartenPruefer1.isValidNumber(5292068884939029L));
        System.out.println(kreditkartenPruefer1.isValidNumber(5292068884939729L));
    }

    public boolean isValidNumber(long number) {
        int lengthNumber = String.valueOf(number).length();
        long lastNumber = Long.valueOf((String.valueOf(number).split("")[lengthNumber - 1]));


        long[] longArr = new long[lengthNumber];

        for (int i = 0; i < lengthNumber - 1; i++) {
            longArr[i] = Long.valueOf(String.valueOf(number).split("")[i]);
        }


        for (int i = 0; i < lengthNumber - 1; i += 2) {
            longArr[i] = longArr[i] * 2;
            if (String.valueOf(longArr[i]).length() >= 2) {
                longArr[i] = Long.valueOf(String.valueOf(longArr[i]).split("")[0]) + Long.valueOf(String.valueOf(longArr[i]).split("")[1]);
            }
        }

        long sum1 = Arrays.stream(longArr).sum();
        long sum2 = sum1;
        if (sum1 % 10 != 0) {
            while (sum2 % 10 != 0) {
                sum2++;
            }
        }
        return sum2 - sum1 == lastNumber;
    }
}