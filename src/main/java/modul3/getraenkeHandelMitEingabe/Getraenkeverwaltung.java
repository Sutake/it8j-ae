package modul3.getraenkeHandelMitEingabe;

import java.util.Scanner;

public class Getraenkeverwaltung {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        // Erzeugen des ersten Objekts
        Getraenk getraenk1;
        getraenk1 = new Getraenk();
// Setzen der Attributswerte via Set-Methoden::
        getraenk1.setName("Ale"); // Strings in Anführungszeichen
        getraenk1.setPreis(1.5); // Dezimaltrennzeichen ist der Punkt
        getraenk1.setBestand(1000);
        getraenk1.setHoechstbestand(2000);
        getraenk1.setMindestbestand(50);
// Ausgabe der Attributswerte des ersten Getränke-Objekts auf der
// Konsole:
        System.out.println("Name des Getränks: "
                + getraenk1.getName());
        System.out.println("Preis: "
                + getraenk1.getPreis());
        System.out.println("Bestand: "
                + getraenk1.getBestand());
        System.out.println("Höchstbestand: "
                + getraenk1.getHoechstbestand());
        System.out.println("Mindestbestand: "
                + getraenk1.getMindestbestand());
        System.out.println();
// Erzeugen eines zweiten Objekts unter Benützung des ersten neuen
// Kon-struktors:
        Getraenk getraenk2;
        getraenk2 = new Getraenk("Dorfbrunnen Mineralwasser");
// Setzen der restlichen Attributswerte via Set-Methoden:
        getraenk2.setPreis(0.5);
        getraenk2.setBestand(3000);
        getraenk2.setHoechstbestand(5000);
        getraenk2.setMindestbestand(1000);
// Ausgabe der Attributswerte des zweiten Getränke-Objekts auf der
// Konso-le:
        System.out.println("Name des Getränks: " + getraenk2.getName());
        System.out.println("Preis: " + getraenk2.getPreis());
        System.out.println("Bestand: " + getraenk2.getBestand());
        System.out.println("Höchstbestand: "
                + getraenk2.getHoechstbestand());
        System.out.println("Mindestbestand: "
                + getraenk2.getMindestbestand());
        System.out.println();
// Erzeugen eines dritten Objekts unter Benützung des zweiten neuen
// Konstruktors:
        Getraenk getraenk3;
        getraenk3 = new Getraenk("Orangenlimonade", 2000, 1800, 700, 0.8);
// Ausgabe der Attributswerte des dritten Getränke-Objekts auf der
// Konso-le:
        System.out.println("Name des Getränks: " + getraenk3.getName());
        System.out.println("Preis: " + getraenk3.getPreis());

        System.out.println("Bestand: " + getraenk3.getBestand());
        System.out.println("Höchstbestand: "
                + getraenk3.getHoechstbestand());
        System.out.println("Mindestbestand: "
                + getraenk3.getMindestbestand());
        System.out.println();
// Eingabe der Verkaufsmenge von Getränk 2 über die Konsole:
// Erzeugen eines Objekts der Klasse Scanner für das Einlesen von der
// Tastatur:
        Scanner tastatur = new Scanner(System.in);
// Deklarieren einer Hilfsvariable zur Abspeicherung der
// Tastatureingabe:
        int menge;
// Beginn des Eingabe-Dialogs auf der Konsole:
        System.out.println("Geben Sie die Verkaufsmenge "
                + "für das Getränk --Dorfbrunnen Mineralwasser-- ein:");
// Der Variablen "menge" wird die letzte Zeile aus dem
// Tastaturpuffer zugewiesen:
        menge = tastatur.nextInt();
         getraenk2.getraenkVerkaufen(menge);
        System.out.println("Von Getränk " + getraenk2.getName()
                + " sind "
                + getraenk2.bestellmengeBerechnen()
                + " Einheiten zu bestellen.");
        System.out.println("Programmende.");
    }
}