package modul4.chapter4;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSortierer {

    @Test
    void testInsertNumberInArray() {
        Sortierer sortierer = new Sortierer();
        int[] actualArray = new int[8];
        actualArray[0] = 17;
        actualArray[1] = 32;
        actualArray[2] = 45;
        actualArray[3] = 53;
        actualArray[4] = 61;
        actualArray[5] = 62;
        actualArray[6] = 75;

        assertArrayEquals(new int[]{17, 32, 45, 50, 53, 61, 62, 75}, sortierer.insertNumberInArray(actualArray, 50));
    }
}