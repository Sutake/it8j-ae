package geldautomat;

public class Konto {
    private double kontostand;

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public void einzahlen(double betrag) {
        this.kontostand += betrag;
    }

    boolean auszahlen(double betrag) {
        if (this.kontostand - betrag >= 0) {
            return true;
        }
        return false;
    }
}
