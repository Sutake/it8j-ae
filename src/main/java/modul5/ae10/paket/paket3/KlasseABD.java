package modul5.ae10.paket.paket3;

import modul5.ae10.paket.paket1.KlasseA;
import modul5.ae10.paket.paket1.KlasseAB;

class KlasseABD extends KlasseAB {
    KlasseA myRef;

    public void test() {
        KlasseAB aa = new KlasseAB();
        String s = aa.print();
    }
}

