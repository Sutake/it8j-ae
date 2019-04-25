package modul4;

public class Wasserzaehler {

    public static void main(String[] args) {
        Wasserzaehler wasserzaehler1 = new Wasserzaehler();
        wasserzaehler1.setZaehlerstandVorjahr(2555);
        wasserzaehler1.setZaehlerstandAktuell(2695);

        System.out.println("Gesamtkosten: " + wasserzaehler1.berechneGesamtkosten());

        Wasserzaehler wasserzaehler2 = new Wasserzaehler();
        wasserzaehler2.setZaehlerstandVorjahr(9812);
        wasserzaehler2.setZaehlerstandAktuell(25);

        System.out.println("Gesamtkosten: " + wasserzaehler2.berechneGesamtkosten());

        Wasserzaehler wasserzaehler3 = new Wasserzaehler();
        wasserzaehler3.setZaehlerstandVorjahr(1236);
        wasserzaehler3.setZaehlerstandAktuell(3100);

        System.out.println("Gesamtkosten: " + wasserzaehler3.berechneGesamtkosten());

        Wasserzaehler wasserzaehler4 = new Wasserzaehler();
        wasserzaehler4.setZaehlerstandVorjahr(7014);
        wasserzaehler4.setZaehlerstandAktuell(1232);

        System.out.println("Gesamtkosten: " + wasserzaehler4.berechneGesamtkosten());
    }

    private double zaehlerstandVorjahr;
    private double zaehlerstandAktuell;
    private double jahresverbrauch;

    public Wasserzaehler() {
    }

    public double getZaehlerstandVorjahr() {
        return zaehlerstandVorjahr;
    }

    public void setZaehlerstandVorjahr(int zaehlerstandVorjahr) {
        this.zaehlerstandVorjahr = zaehlerstandVorjahr;
    }

    public double getZaehlerstandAktuell() {
        return zaehlerstandAktuell;
    }

    public void setZaehlerstandAktuell(int zaehlerstandAktuell) {
        this.zaehlerstandAktuell = zaehlerstandAktuell;
    }

    public double getJahresverbrauch() {
        return jahresverbrauch;
    }

    public void setJahresverbrauch(int jahresverbrauch) {
        this.jahresverbrauch = jahresverbrauch;
    }

    public double berechneGesamtkosten() {
        double jahresverbrauch;
        if (zaehlerstandVorjahr > zaehlerstandAktuell) {

            jahresverbrauch = 10000 - zaehlerstandVorjahr + zaehlerstandAktuell;
        } else {
            jahresverbrauch = zaehlerstandAktuell - zaehlerstandVorjahr;
        }
        if (jahresverbrauch < 400) {
            return jahresverbrauch * 3.7 + 45;
        } else {
            return jahresverbrauch * 2.6 + 100;
        }
    }
}
