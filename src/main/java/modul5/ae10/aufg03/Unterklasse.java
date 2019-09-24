package modul5.ae10.aufg03;

public class Unterklasse extends Oberklasse {
    public Unterklasse (int e, int f) {
        super(e+f);
        System.out.println("K-Unterklasse: "+ wert);
        wert = wert + e +f;
        System.out.println("K-Unterklasse: "+ wert);
    } // Ende Konstruktor Unterklasse
    public static void main(String[] args) {
        System.out.println("ok");
        Oberklasse ok = new Oberklasse(10);
        ok.wert++;
        System.out.println(ok.wert);
        System.out.println("uk");
        Unterklasse uk = new Unterklasse(2,3);
        ok.wert--;
        System.out.println(ok.wert);
    }
}
