package modul4.chapter3;

public class Sofortrente {

    public static void main(String[] args) {
        Sofortrente sofortrente = new Sofortrente(1000000, 4);
        sofortrente.berechneZeitraum();
    }

    private double zinssatz;
    private double einlage;

    public Sofortrente(double einlage, double zinssatz) {
        this.zinssatz = zinssatz;
        this.einlage = einlage;
    }

    public void berechneZeitraum() {
        int jahre = 0;

        while (einlage > 0) {
            einlage = einlage * (1 + zinssatz / 100) - 60000;
            jahre++;
        }

        if (einlage > 0) {
            System.out.println("Nach " + jahre + " ist die Einlage auf " + einlage + " geschmolzen.");
        } else {
            System.out.println("Nach " + (jahre - 1) + " Jahren musst Du wieder arbeiten!");
        }
    }
}
