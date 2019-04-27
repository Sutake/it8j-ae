package modul4.chapter2;

import java.util.Scanner;

public class Wochentag {

    public static void main(String[] args) {
        Wochentag wochentag = new Wochentag();
        System.out.println("Type in a number from 1 to 7. The number will appear as a weekday.");
        System.out.println(wochentag.übersetze());
    }

    public String übersetze() {
        int number = new Scanner(System.in).nextInt();

        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "You didn't type a valid number";
        }
    }
}
