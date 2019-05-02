package modul4.chapter3;

public class Reis {
    public static void main(String[] args) {
        Reis reis = new Reis();
        reis.summiere();
        System.out.println();
        System.out.println("You need " + reis.wiegen() + " wagons to transport the amount of rice grain.");
    }

    private double summe;

    public double summiere() {
        for (int i = 0; i <= 64; i++) {
            summe += Math.pow(2, i);
            System.out.println(summe);
        }
        return summe;
    }

    public double wiegen() {
        double result = summiere() / 200; //rice in gram
        result = result / 1000000; //rice in metric tons
        return result / 30;
    }
}