package modul4.chapter4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Statistik {

    public static void main(String[] args) {
        Statistik statistik = new Statistik(new double[]{1.4, 5.3, 1.4, 1, 3.2});
        System.out.println("Summe = " + statistik.berechneSumme());
        System.out.println("Avg = " + statistik.berechneMittelwert());
        System.out.println("Min = " + statistik.berechneMin());
        System.out.println("Max = " + statistik.berechneMax());
        System.out.println("Modus = " + statistik.berechneModus());
    }

    private double[] zahlen;

    public Statistik(double[] zahlen) {
        this.zahlen = zahlen;
    }

    public double addieren() {
        return Arrays.stream(zahlen).sum();
    }

    public double berechneMax() {
        return Arrays.stream(zahlen).max().getAsDouble();
    }

    public double berechneMittelwert() {
        return Arrays.stream(zahlen).average().getAsDouble();
    }

    public double berechneMin() {
        return Arrays.stream(zahlen).min().getAsDouble();
    }

    public double berechneSumme() {
        return Arrays.stream(zahlen).sum();
    }

    @Override
    public String toString() {
        return "Statistik{" +
                "zahlen=" + Arrays.toString(zahlen) +
                '}';
    }

    public double berechneModus() {
        Map<Double, Integer> mapToCount = new HashMap<>();
        for (double v : zahlen) {
            mapToCount.put(v, mapToCount.getOrDefault(v, 0) + 1);
        }
        return mapToCount.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }
}