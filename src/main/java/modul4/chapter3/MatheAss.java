package modul4.chapter3;

import java.util.Scanner;

public class MatheAss {
    public static void main(String[] args) {
        System.out.println("Type in a number");
        int result = 0;

        String temp = Integer.toString(new Scanner(System.in).nextInt());
        for (int i = 0; i < temp.length(); i++) {
            result += temp.charAt(i) - '0';
        }
        System.out.println(result);
    }
}