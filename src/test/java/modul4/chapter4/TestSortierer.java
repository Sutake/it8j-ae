package modul4.chapter4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSortierer {

    @Test
    void testInsertNumberInArray() {
        Sortierer sortierer = new Sortierer();
        int [] result = new int[]{17,32,45,50,53,61,62,75};
        int[] actualArray = new int[8];
        actualArray[0] = 17;
        actualArray[1] = 32;
        actualArray[2] = 45;
        actualArray[3] = 53;
        actualArray[4] = 61;
        actualArray[5] = 62;
        actualArray[6] = 75;

        Assertions.assertArrayEquals(result, sortierer.insertNumberInArray(actualArray,50));
    }
}