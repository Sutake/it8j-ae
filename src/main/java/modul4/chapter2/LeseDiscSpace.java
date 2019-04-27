package modul4.chapter2;

import java.io.File;

public class LeseDiscSpace {
    public static void main(String[] args) {

        //for Windows: pathname = "C:\\".
        File f = new File("/Volumes");
        System.out.println(f.getTotalSpace());
        System.out.println((f.getTotalSpace() / 1024 / 1024 / 1024) + "GByte Gesamtspeicher");
        System.out.println((f.getFreeSpace() / 1024 / 1024 / 1024) + "GByte freier Speicher");
    }
}
