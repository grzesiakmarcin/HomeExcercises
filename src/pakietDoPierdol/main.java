package pakietDoPierdol;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String wyraz = " string";
        String wyraz2 = "     s  t r i n  g";

        String trim1 = wyraz.trim();
        String trim2 = wyraz2.trim().replace(" ","");


        System.out.println(trim1.equals(trim2));
        System.out.println(trim1);
        System.out.println(trim2);


    }



}

