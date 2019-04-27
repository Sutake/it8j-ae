package modul4.chapter2;

public class Luftmessung {
    private double grenzwert;

    public static void main(String[] args) {
        Luftmessung luftmessung1 = new Luftmessung();
        luftmessung1.setGrenzwert(1000);
        luftmessung1.pruefe(900);

        Luftmessung luftmessung2 = new Luftmessung();
        luftmessung2.setGrenzwert(1000);
        luftmessung2.pruefe(1700);
    }

    public Luftmessung() {
    }

    public double getGrenzwert() {
        return grenzwert;
    }

    public void setGrenzwert(double grenzwert) {
        this.grenzwert = grenzwert;
    }

    public void pruefe(double wert) {
        System.out.println("Der Genzwert beträgt " + grenzwert + " ppm");
        System.out.println("Der Messwert beträgt " + wert + " ppm");
        if (wert < this.grenzwert) {
            System.out.println("Der Messwert liegt unterhalb des Grenzwertes");
            System.out.println();
        } else {
            System.out.println("Der Messwert überschreitet den Grenzwert um " + (wert - grenzwert));
            System.out.println();
        }
    }
}
