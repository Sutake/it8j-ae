package modul4.chapter3;

public class Reis {
    public static void main(String[] args) {
        Reis reis = new Reis();
        reis.summiere();
    }

    private double summe;

    public double summiere() {
        for (int i = 0; i <= 64; i++) {
            summe += Math.pow(2, i);
            System.out.println(summe);
        }
        return summe;
    }
}