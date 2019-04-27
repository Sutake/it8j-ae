package modul4.chapter2;


public class MatheMachtSpass {

    private static void ausgabeDreieck(MatheMachtSpass matheMachtSpass) {
        if (matheMachtSpass.dreieick()) {
            System.out.println("Es ist ein Dreieck!");
        } else {
            System.out.println("Es ist kein Dreieck!");
        }
    }

    private static void ausgabePythagoras(MatheMachtSpass matheMachtSpass) {
        if (matheMachtSpass.pythagoras()) {
            System.out.println("Es handelt sich um ein rechtwinkliges Dreieck");
        } else {
            System.out.println("Das Dreieck ist nicht rechtwinklig");
        }
    }

    public static void main(String[] args) {
        MatheMachtSpass matheMachtSpass1 = new MatheMachtSpass(3, 4, 5);
        System.out.println("Erstes Dreieck mit den Seitenlängen " + matheMachtSpass1.getA() + ", " + matheMachtSpass1.getB() + "und " + matheMachtSpass1.getC() +":");

        ausgabeDreieck(matheMachtSpass1);
        ausgabePythagoras(matheMachtSpass1);
        System.out.println();
        MatheMachtSpass matheMachtSpass2 = new MatheMachtSpass(100, 4, 5);
        System.out.println("Zweites Dreieck mit den Seitenlängen " + matheMachtSpass1.getA() + ", " + matheMachtSpass1.getB() + "und " + matheMachtSpass1.getC() +":");
        ausgabeDreieck(matheMachtSpass2);
        ausgabePythagoras(matheMachtSpass2);
    }

    private int a;
    private int b;
    private int c;

    public MatheMachtSpass(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean pythagoras() {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

    public boolean dreieick() {
        return a + b > c && a + c > b && b + c > a;
    }

    @Override
    public String toString() {
        return "MatheMachtSpass{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
