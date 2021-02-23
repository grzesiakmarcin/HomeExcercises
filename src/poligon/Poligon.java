package poligon;

import enums.Klasa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poligon {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Podaj haslo");
//        int zeskanowano=sc.nextInt();
//
//
//        String pass =String.valueOf(zeskanowano);
//
//
//        int passInt=zeskanowano;
//
//        int[] tablica = new int[pass.length()];
//
//
//        Klasa1 kl = new Klasa1();
//
//        System.out.println("Odpalam makeArrayFromInt");
//
//
//        System.out.println( kl.makeArrayFromInt(tablica, passInt)+"\n");
//
//
//        System.out.println("Odpalam makeArrayFromString");
//        System.out.println(kl.makeArrayFromString(tablica,pass));

        int max = 9;
        int min = 1;
        int range = max - min + 1;

        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;

            // Output is different everytime this code is executed

            System.out.println(rand);

            List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 2, 3, 4));


            List<Integer> singletonList = Collections.singletonList(100);
            Collections.rotate(numbers,1);

        }
    }


    class Klasa1 {

        public int[] makeArrayFromInt(int[] array, int sas) {

            String robimyStirnga = String.valueOf(sas);

            for (int i = 0; i < array.length; i++) {
                array[i] = robimyStirnga.charAt(i);

            }
            return array;
        }


        public int[] makeArrayFromString(int[] array, String string) {

            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(string.substring(i, i + 1));
            }
            return array;
        }

        public int[] makeArrayFromString(StringBuilder string, int[] array) {

            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(string.substring(i, i + 1));
            }
            return array;
        }




    }
}
