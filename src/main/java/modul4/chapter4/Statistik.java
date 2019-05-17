package modul4.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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

    public int berechneModus() {
        Map<Double, Integer> mapToCount = new HashMap<>();
        int length = zahlen.length;

        for (int i = 0; i <= length - 1; i++) {
            mapToCount.put(zahlen[i], 0);
        }

        for (double v : zahlen) {
            mapToCount.put(v, mapToCount.get(v) + 1);
        }

        int x = 0;
        for (Integer value : mapToCount.values()) {
            if (x < value) {
                x = value;
            }
        }
        return x;
    }
}