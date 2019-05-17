package modul4.chapter4;

public class TestStatistik {

    public static void main(String[] args) {
        Statistik statistik = new Statistik(new double[]{1.4, 5.3, 1.4, 1, 3.2});
       /* System.out.println("Summe = " + statistik.berechneSumme());
        System.out.println("Avg = " + statistik.berechneMittelwert());
        System.out.println("Min = " + statistik.berechneMin());
        System.out.println("Max = " + statistik.berechneMax());*/
        System.out.println("Modus = " + statistik.berechneModus());
    }
}
