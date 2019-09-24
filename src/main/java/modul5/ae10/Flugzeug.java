package modul5.ae10;

public class Flugzeug {

    private int anzahlPassagiere;

    public int getAnzahlPassagiere() {
        return anzahlPassagiere;
    }

    /**
     *
     * @param p the number of passengers
     */
    public void einsteigen(int p) {
        if (isPositive(p)) {
            anzahlPassagiere += p;
        }
    }

    private boolean isPositive(int p) {
        return p > 0;
    }

    public static void main(String[] args) {
        Flugzeug flugzeug = new Flugzeug();
        flugzeug.einsteigen(10);

        System.out.println("Es befinden sich " + flugzeug.getAnzahlPassagiere() + " Passagiere im Flugzeug");
    }
}
