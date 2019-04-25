package modul4;

public class Schaltjahr {

    public static void main(String[] args) {
        Schaltjahr schaltjahr = new Schaltjahr();

        System.out.println("Sollte Schaltjahre sein:");
        System.out.println(schaltjahr.pruefeJahr(4));
        System.out.println(schaltjahr.pruefeJahr(400));
        System.out.println(schaltjahr.pruefeJahr(2000));
        System.out.println(schaltjahr.pruefeJahr(20012));

        System.out.println();

        System.out.println("Sollte keine Schaltjahre sein:");
        System.out.println(schaltjahr.pruefeJahr(2));
        System.out.println(schaltjahr.pruefeJahr(100));
        System.out.println(schaltjahr.pruefeJahr(1900));
    }

    public String pruefeJahr(int jahr) {
        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    return "Schaltjahr";
                } else {
                    return "kein Schaltjahr";
                }
            } else {
                return "Schaltjahr";
            }
        } else {
            return "kein Schaltjahr";
        }
    }
}