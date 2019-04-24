package portoRechner;

public class PortoRechner {

    public static void main(String[] args) {
        PortoRechner portoRechner = new PortoRechner();
        System.out.println(portoRechner.berechneKosten(99));
        System.out.println(portoRechner.berechneKosten(100));
        System.out.println(portoRechner.berechneKosten(101));
        System.out.println(portoRechner.berechneKosten(199));
        System.out.println(portoRechner.berechneKosten(200));

    }

    public double berechneKosten(double auftragsumme) {
        if (auftragsumme < 100) {
            return 5.5;
        } else if (auftragsumme >= 100 && auftragsumme < 200) {
            return 3;
        } else {
            return 0;
        }
    }
}