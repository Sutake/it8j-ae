package modul4;

public class Verzinsung {
    public static void main(String[] args) {
        Verzinsung verzinsung = new Verzinsung();
        System.out.println("Nach " + verzinsung.millionaerMacher(1000, 2) + " Jahren ist die Einlage auf " + verzinsung.getKontostand() + "€ gewachsen");
    }

    private double einlage;
    private double zinssatz;
    private double kontostand;


    public double getEinlage() {
        return einlage;
    }

    public void setEinlage(double einlage) {
        this.einlage = einlage;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public void setZinssatz(double zinssatz) {
        this.zinssatz = zinssatz;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public double millionaerMacher(double einlage, double zinssatz) {
        this.einlage = einlage;
        this.zinssatz = zinssatz;

        double jahr = 0;
        while (einlage < 1000000) {
            einlage = einlage + (einlage * zinssatz / 100);
            jahr++;
        }

        this.kontostand = einlage;
        return jahr;
    }
}