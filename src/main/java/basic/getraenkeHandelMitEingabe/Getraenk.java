package basic.getraenkeHandelMitEingabe;

public class Getraenk {

    private String name;
    private int hoechstbestand;
    private int mindestbestand;
    private int bestand;
    private double preis;


    public Getraenk() {
    }

    public Getraenk(String name) {
        this.name = name;
    }

    public Getraenk(String name, int hoechstbestand, int mindestbestand, int bestand, double preis) {
        this.name = name;
        this.hoechstbestand = hoechstbestand;
        this.mindestbestand = mindestbestand;
        this.bestand = bestand;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getBestand() {
        return bestand;
    }

    public void setBestand(int bestand) {
        this.bestand = bestand;
    }

    public int getHoechstbestand() {
        return hoechstbestand;
    }

    public void setHoechstbestand(int hoechstbestand) {
        this.hoechstbestand = hoechstbestand;
    }

    public int getMindestbestand() {
        return mindestbestand;
    }

    public void setMindestbestand(int mindestbestand) {
        this.mindestbestand = mindestbestand;
    }

    public void getraenkVerkaufen(int menge) {
        this.bestand -= menge;
    }

    public int bestellmengeBerechnen() {
        return Math.abs(hoechstbestand - bestand);
    }
}
