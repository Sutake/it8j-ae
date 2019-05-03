package modul4.chapter3;

public class Baufinanzierung {

    public static void main(String[] args) {
        Baufinanzierung baufinanzierung = new Baufinanzierung(100000, 7, 2);
        baufinanzierung.erstelleTilgungsplan();
    }

    private double darlehensbetrag;
    private double zinssatz;
    private double tilgungssatz;

    public Baufinanzierung(double darlehensbetrag, double zinssatz, double tilgungssatz) {
        this.darlehensbetrag = darlehensbetrag;
        this.zinssatz = zinssatz;
        this.tilgungssatz = tilgungssatz;
    }

    private String toEuro(double number) {
        final double d_euro = number;
        final int post = Math.abs((int) Math.round((d_euro % 1) * 100));

        return ((int) d_euro) + "," + (post < 10 ? "0" + post : post) + " €";
    }

    public void erstelleTilgungsplan() {
        double zinsen = this.darlehensbetrag * zinssatz / 100;
        double tilgung = this.darlehensbetrag * tilgungssatz / 100;

        double jahr = 1;
        double annuitaet = zinsen + tilgung;
        double tempZinsen;

        while (darlehensbetrag > tilgung) {
            System.out.print("Jahr: " + jahr++ + "\t Darlehensbetrag: " + toEuro(darlehensbetrag) + "\t Zinsen: " + toEuro(zinsen) + "\t Tilgung: " + toEuro(tilgung) + "\t Annuitaet: " + toEuro(annuitaet));
            System.out.println();

            darlehensbetrag = darlehensbetrag - tilgung;
            tempZinsen = zinsen;
            zinsen = darlehensbetrag * zinssatz / 100;

            tilgung = tilgung + tempZinsen - zinsen;
            annuitaet = zinsen + tilgung;
        }

        //correction because of the last continuous loop
        darlehensbetrag = darlehensbetrag + tilgung;

        darlehensbetrag = darlehensbetrag - tilgung;

        zinsen = darlehensbetrag * zinssatz / 100;
        tilgung = darlehensbetrag;
        annuitaet = zinsen + tilgung;
        System.out.print("Jahr: " + jahr++ + "\t Darlehensbetrag: " + toEuro(darlehensbetrag) + "\t \t Zinsen: " + toEuro(zinsen) + "\t Tilgung: " + toEuro(tilgung) + "\t Annuitaet: " + toEuro(annuitaet));
    }
}
