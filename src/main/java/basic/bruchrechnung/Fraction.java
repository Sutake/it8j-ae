package basic.bruchrechnung;

public class Fraction {
    private int numerator;
    private int denominator;
    private int wholeNumber;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int wholeNumber, int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.wholeNumber = wholeNumber;
    }

    public int getZaehler() {
        return numerator;
    }

    public void setZaehler(int numerator) {
        this.numerator = numerator;
    }

    public int getNenner() {
        return denominator;
    }

    public void setNenner(int denominator) {
        this.denominator = denominator;
    }

    public int getGanzZahl() {
        return wholeNumber;
    }

    public void setGanzZahl(int wholeNumber) {
        this.wholeNumber = wholeNumber;
    }

    private void correctionBruch(Fraction bruch) {
        if (this.getZaehler() < 0 && this.denominator < 0) {
            this.setZaehler(Math.abs(this.getZaehler()));
            this.setNenner(Math.abs(this.getNenner()));
        }
        if (bruch.getZaehler() < 0 && bruch.getNenner() < 0) {
            bruch.setZaehler(Math.abs(bruch.getZaehler()));
            bruch.setNenner(Math.abs(bruch.getNenner()));
        }
    }

    public Fraction multiplyBy(Fraction bruch) {
        correctionBruch(bruch);
        return new Fraction(this.numerator * bruch.getZaehler(), this.denominator * bruch.getNenner());


    }

    public Fraction divideBy(Fraction bruch) {
        correctionBruch(bruch);
        return new Fraction(numerator * bruch.getNenner(), denominator * bruch.getZaehler());
    }

    public Fraction add(Fraction bruch) {
        int mainDenominator = denominator * bruch.getNenner();
        return new Fraction((mainDenominator / denominator * numerator) + (mainDenominator / bruch.getNenner() * bruch.getZaehler()), mainDenominator);
    }

    public Fraction sub(Fraction bruch) {
        int mainDenominator = denominator * bruch.getNenner();
        return new Fraction((mainDenominator / denominator * numerator) - (mainDenominator / bruch.getNenner() * bruch.getZaehler()), mainDenominator);
    }

    public static Fraction reduceFraction(Fraction bruch) {
        int denominator = bruch.getNenner();
        int numerator = bruch.getZaehler();
        int i = Math.abs(denominator);
        while (i != 1) {
            if ((denominator % i == 0) && (numerator % i == 0)) {
                denominator = denominator / i;
                numerator = numerator / i;
            } else {
                i--;
            }
        }
        if (numerator > denominator) {
            return new Fraction(numerator / denominator, numerator % denominator, denominator);
        }
        return new Fraction(numerator, denominator);
    }

    @Override
    public String toString() {
        if (wholeNumber >= 1) {
            return wholeNumber + " " + numerator + "/" + denominator;
        }
        return numerator + "/" + denominator;
    }
}