package modul5.ae07;

public class LowClass extends TopClass {

    protected static int zaehler;


    public LowClass() {
        super();
        zaehler++;
    }

    public static int getZaehler() {
        return zaehler;
    }

    public void test() {
        System.out.println("LowClass: " + getZaehler());
        System.out.println("TopClass: " + TopClass.getZaehler());
    }
}
