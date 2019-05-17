package modul4.chapter4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Statistik {
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

        double result = mapToCount.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

        int x = 0;
        double key = 0d;
        for (Map.Entry<Double, Integer> doubleIntegerEntry : mapToCount.entrySet()) {
            if (x < doubleIntegerEntry.getValue()) {
                x = doubleIntegerEntry.getValue();
                key = doubleIntegerEntry.getKey();
            }
        }
        return result;
    }
}