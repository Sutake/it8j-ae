package modul4.chapter3;

public class Quadratwurzel {
    public static void main(String[] args) {
        double zahl = 2;
        double startwert = 1;
        double genauigkeit = 0.000001;

        Quadratwurzel quadratwurzel = new Quadratwurzel();
        System.out.println(quadratwurzel.quadratwurzelBerechnung(zahl, startwert, genauigkeit));
    }

    private double quadratwurzelBerechnung(double z, double s, double eps) {
        double x = s;

        do {
            x = 0.5 * (x + z / x);
        } while ((x * x - z) * (x + x - z) >= eps * eps);

        return x;
    }
}
