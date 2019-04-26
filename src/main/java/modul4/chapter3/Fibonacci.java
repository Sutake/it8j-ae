package modul4.chapter3;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.berechneNächsteZahl();
    }

    private int x = 0;
    private int y = 1;
    private int z;


    public void berechneNächsteZahl() {
        while (z + x + y < 1000) {
            z = x + y; // erg = die ersten beiden Zahlen
            x = y; // gleich setzten von a und b
            y = z; // b auf erg setzen damit die Summe der beiden Vorgänger gebildet werden
            System.out.print(z + "\t");
        }
    }
}
