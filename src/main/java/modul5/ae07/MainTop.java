package modul5.ae07;

public class MainTop {
    private static int size = 3;

    public static void main(String[] args) {
        TopClass[] feldT = new TopClass[size];
        LowClass[] feldL = new LowClass[size];
        for (int i = 0; i < size; i++) feldT[i] = new TopClass();
        for (int i = 0; i < size; i++) {
            feldL[i] = new LowClass();
            feldL[i].test();
        }
        System.out.println(TopClass.getZaehler() + " Instanzen TopClass generiert, " +
                LowClass.getZaehler() + " Instanzen LowClass generiert");
    }
}