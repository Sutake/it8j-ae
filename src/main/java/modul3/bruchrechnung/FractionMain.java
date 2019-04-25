package modul3.bruchrechnung;

public class FractionMain {
    public static void main(String[] args) {

        Fraction b1 = new Fraction(0, 1);
        Fraction b2 = new Fraction(-2, 3);
        try {
            Fraction ergMul = b1.multiplyBy(b2);
            Fraction ergDiv = b1.divideBy(b2);
            Fraction ergAdd = b1.add(b2);
            Fraction ergSub = b1.sub(b2);
            System.out.println(b1 + " * " + b2 + " = " + ergMul + " = " + Fraction.reduceFraction(ergMul));

            System.out.println(b1 + " / " + b2 + " = " + ergDiv + " = " + Fraction.reduceFraction(ergDiv));
            System.out.println(b1 + " + " + b2 + " = " + ergAdd + " = " + Fraction.reduceFraction(ergAdd));
            System.out.println(b1 + " - " + b2 + " = " + ergSub + " = " + Fraction.reduceFraction(ergSub));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occured");
        }
    }
}
