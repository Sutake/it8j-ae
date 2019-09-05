package modul4.chapter4;


import org.junit.jupiter.api.Test;

public class TestSortierer {

    @Test
    void testInsertNumberInArray() {
        Sortierer sortierer = new Sortierer();
        int[] actualArray = new int[]{17, 32, 45, 53, 61, 62, 75};

        assertArrayEquals(new int[]{17, 32, 45, 50, 53, 61, 62, 75}, sortierer.insertNumberInArray(actualArray, 50));
    }

    @Test
    void testDeleteNumberFromArray() {
        Sortierer sortierer = new Sortierer();
        int[] actualArray = new int[]{10, 7, 61, 4, 75, 34};

        assertArrayEquals(new int[]{10, 7, 4, 75, 34, 0}, sortierer.deleteNumberFromArray(actualArray, 61));
    }

    @Test
    void sortInts() {
        assertArrayEquals(new int[]{1, 3, 4, 5}, Sortierer.sortInts(new int[]{4, 1, 5, 3}));
    }
}