package modul4.chapter3;

public class Reis {
    public static void main(String[] args) {
        Reis reis = new Reis();
        reis.summiere();
        reis.wiegen();
    }

    private double summe;

    public double summiere() {
        for (int i = 0; i <= 64; i++) {
            summe += Math.pow(2, i);
            System.out.println(summe);
        }
        return summe;
    }

    public void wiegen() {
        double result = summiere() / 200; //rice in gram
        result = result / 1000000; //rice in metric tons
        System.out.println("The weight of the rice is : " + result + " t.");
        result = result / 30;
        System.out.println("You need " + result + " wagons to transport all the rice.");
    }
}