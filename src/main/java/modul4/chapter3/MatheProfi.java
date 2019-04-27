package modul4.chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatheProfi {
    public static void main(String[] args) {
        int x = 100;
        int i = x;
        List<Integer> listInt = new ArrayList<>();

        while (i >= 1) {
            if (x % i == 0) {
                listInt.add(i);
            }
            i--;
        }
        //used static method of class Collections to sort numbers.
        Collections.sort(listInt);
        listInt.forEach(System.out::println);
    }
}