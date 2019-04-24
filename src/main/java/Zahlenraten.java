import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {

    private static void printTypeOfNumber () {
        System.out.println("Type in a number. I'm gonna tell you if this number is bigger or less than 0.");
        int number = new Scanner(System.in).nextInt();

        if (number > 0) {
            if (number % 2 == 0){
                System.out.println("Your number "+ number +" is bigger than 0 and even.");
            } else {
                System.out.println("Your number "+ number +" is bigger than 0 and odd.");
            }

        } else if (number < 0) {

            if (number % 2 == 0){
                System.out.println("Your number "+ number +" is less than 0 and even.");
            } else {
                System.out.println("Your number "+ number +" is less than 0 and odd.");
            }
        } else {
            System.out.println("Your number is 0");
        }
    }
    public static void main(String[] args) {

        //printTypeOfNumber();
        int theNumber = new Random().nextInt(20);
        System.out.println(theNumber);

        System.out.println("Input a number from 0 to 20");
        int userInput = new Scanner(System.in).nextInt();

        if (userInput == theNumber) {
            System.out.println("Congrats.");
        }
        while (theNumber != userInput) {
            if (userInput > theNumber) {
                System.out.println("Your number was too big.");
                System.out.println("Type another number, please");

            } else {
                System.out.println("Your number was too short.");
                System.out.println("Type another number, please.");
            }
            userInput = new Scanner(System.in).nextInt();
            if (userInput == theNumber) {
                System.out.println("Congrats.");
            }
        }
    }
}
