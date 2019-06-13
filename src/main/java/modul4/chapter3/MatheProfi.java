package modul4.chapter3;

public class MatheProfi {
    public static void main(String[] args) {
        int x = 8;
        int i = x;

        while (i >= 1) {
            if (x % i == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}