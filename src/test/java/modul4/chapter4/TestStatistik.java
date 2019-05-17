package modul4.chapter4;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStatistik {

    @Test
    public void testAddieren() {
        Statistik statistik = new Statistik(new double[]{1.4, 5.3, 1.4, 1, 3.2});
        assertEquals(12.3, statistik.addieren());
    }

    @Test
    public void testMittelwert() {
        Statistik statistik = new Statistik(new double[]{1.4, 5.3, 1.4, 1, 3.2});
        assertEquals(2.46, statistik.berechneMittelwert());
    }

    @Test
    public void testMinimum() {
        Statistik statistik = new Statistik(new double[]{1.4, 5.3, 1.4, 1, 3.2});
        assertEquals(1.0, statistik.berechneMin());
    }

    @Test
    public void testMaximum() {
        Statistik statistik = new Statistik(new double[]{1.4, 5.3, 1.4, 1, 3.2});
        assertEquals(5.3, statistik.berechneMax());
    }

    @Test
    public void testModus() {
        Statistik statistik = new Statistik(new double[]{1.4, 5.3, 1.4, 1, 3.2});
        assertEquals(2, statistik.berechneModus());
    }
}
