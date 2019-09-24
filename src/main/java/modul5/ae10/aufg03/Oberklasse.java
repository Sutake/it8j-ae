package modul5.ae10.aufg03;

public class Oberklasse {
    public int wert;

    public Oberklasse(int a) {
        wert = a;
        System.out.println("K-Oberklasse: " + wert);
        a++;
    }

    public static void main(String[] args) {
        Oberklasse ok = new Oberklasse(10);
        ok.wert++;
        System.out.println(ok.wert);
    }
}
