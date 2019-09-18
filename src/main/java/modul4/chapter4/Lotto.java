package modul4.chapter4;

public class Lotto {

    public Lotto(int[] randomLottoNumbers) {
        this.randomLottoNumbers = randomLottoNumbers;
    }

    private int[] randomLottoNumbers;

    public int calcResult(int[] inputNumbers) {
        int counter = 0;
        for (int lottoNumber : randomLottoNumbers) {
            for (int inputNumber : inputNumbers) {
                if (lottoNumber == inputNumber) {
                    counter++;
                }
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