package modul5.ae07;

public class TopClass {
    static protected int zaehlerTop;

    public TopClass() {
        zaehlerTop++;
    }

    public static int getZaehler() {
        return zaehlerTop;
    }
}
