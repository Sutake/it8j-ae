package modul4.chapter4;

public class Lotto {

    public Lotto(int[] randomLottoNumbers) {
        this.randomLottoNumbers = randomLottoNumbers;
    }

    //hier kommen die random Lottozahlen rein
    private int[] randomLottoNumbers = new int[6];

    public int calcResult(int[] inputNumbers) {
        int counter = 0;
        int[] sortedInputNumbers = sortInts(inputNumbers);
        int[] sortedLottoNumbers = sortInts(randomLottoNumbers);
        for (int i = 0; i < sortedInputNumbers.length - 1; i++) {
            if (sortedInputNumbers[i] == sortedLottoNumbers[i]) {
                counter ++;
            }
        }
        return counter;
    }

    private static int[] sortInts(int[] myInts) {
        for (int i = 1; i < myInts.length; i++) {
            for (int j = myInts.length - 1; j >= i; j--) {
                if (myInts[j] < myInts[j - 1]) {
                    int temp = myInts[j];
                    myInts[j] = myInts[j - 1];
                    myInts[j - 1] = temp;
                }
            }
        }
        return myInts;
    }
}
