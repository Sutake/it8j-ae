import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.*;

public class IpFormatter {
    private String convertDecimalIpAdress(String myIpAdress) {

        List<String> myBinaryIpAdress = new ArrayList<>();

        int[] splittedIpAdresses = stream(myIpAdress.split("\\."))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int splittedIpAdress : splittedIpAdresses) {
            myBinaryIpAdress.add(String.format("%08d", Integer.valueOf(Integer.toBinaryString(splittedIpAdress))));
        }
        return myBinaryIpAdress.get(0) + "." + myBinaryIpAdress.get(1) + "." + myBinaryIpAdress.get(2) + "." + myBinaryIpAdress.get(3);
    }

    public static void main(String[] args) {
        IpFormatter ipFormatter = new IpFormatter();
        System.out.println("Geben sie eine decimale IP-Adresse an.");
        String inputString = new Scanner(System.in).next();
        System.out.println(ipFormatter.convertDecimalIpAdress(inputString));
    }
}
