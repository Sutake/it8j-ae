package modul4.chapter3;

public class Sofortrente {

    public static void main(String[] args) {
        Sofortrente sofortrente = new Sofortrente(1000000, 6);
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

        while ((einlage * (1 + zinssatz / 100)) >= 60000) {
            einlage = einlage * (1 + zinssatz / 100) - 60000;
            jahre++;
        }

        System.out.println(jahre);
    }
}
