package modul4.chapter3;

public class Wachstumsentwicklung {
    public static void main(String[] args) {
        Wachstumsentwicklung wachstumsentwicklung = new Wachstumsentwicklung();
        System.out.println(wachstumsentwicklung.umsatzwachstum(500000, 8));
    }

    public int umsatzwachstum(double umsatz, double wachstumsrate) {
        int jahr = 0;
        while (umsatz <= 1000000) {
            umsatz = umsatz + (umsatz * wachstumsrate / 100);
            jahr++;
        }
        return jahr;
    }
}