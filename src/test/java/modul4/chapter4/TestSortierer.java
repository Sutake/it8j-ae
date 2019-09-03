package modul4.chapter4;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSortierer {

    @Test
    void testInsertNumberInArray() {
        Sortierer sortierer = new Sortierer();
        int[] actualArray = new int[]{17,32,45,53,61,62,75};

        assertArrayEquals(new int[]{17, 32, 45, 50, 53, 61, 62, 75}, sortierer.insertNumberInArray(actualArray, 50));
    }
}