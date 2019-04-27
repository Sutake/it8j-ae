package modul4.chapter2;

public class Taschenrechner {
    public static void main(String[] args) {
        Taschenrechner taschenrechner = new Taschenrechner();
        taschenrechner.setZahl1(20);
        taschenrechner.setZahl2(0);
        taschenrechner.setOperator('/');
        if (taschenrechner.getZahl2() == 0 && taschenrechner.getOperator() == '/') {
            System.out.println("You cannot divide by zero");
        } else {
            taschenrechner.berechne();
        }
    }

    private double zahl1;
    private double zahl2;
    private char operator;

    public Taschenrechner() {

    }

    public double getZahl1() {
        return zahl1;
    }

    public void setZahl1(double zahl1) {
        this.zahl1 = zahl1;
    }

    public double getZahl2() {
        return zahl2;
    }

    public void setZahl2(double zahl2) {
        this.zahl2 = zahl2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double berechne() {
        switch (operator) {
            case '+':
                return zahl1 + zahl2;
            case '-':
                return zahl1 - zahl2;
            case '*':
                return zahl1 * zahl2;
            case '/':
                return zahl1 / zahl2;

            default:
                return 0;
        }
    }
}
