package modul4;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                //cares for the indenting depending on the number of digit
                if (i * j < 10) {
                    System.out.print(" ");
                }
                if (i * j < 99) {
                    System.out.print(" ");
                }
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}