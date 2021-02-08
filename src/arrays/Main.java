package arrays;

import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Bebechy o = new Bebechy();
        Scanner sc = new Scanner(System.in);



        System.out.println("Podaj długość hasła");
        int dlugoscHasla = sc.nextInt();

        o.metodka(dlugoscHasla);
    }


}

class Bebechy {

    public void metodka(int ileCyfr) {

        String przykladowe = String.valueOf(System.nanoTime());
        String przykladowe2 = String.valueOf(System.nanoTime());
        StringBuilder sb = new StringBuilder(przykladowe+przykladowe2);


        char[] tablica = String.valueOf(sb).toCharArray();

        LinkedHashSet<Character> lista = new LinkedHashSet<Character>();

        System.out.println("utowrzylem set");



        do {
            lista.add((charCyfraRoznaOdZera()));
        } while (ileCyfr > lista.size());



        System.out.println("skonczylem dodawac");

        for (Character element: lista) {
            System.out.print(element.toString()+",");
        }


    }

    public int cyfraRoznaOdZera() {
        Random cyfra = new Random();
        int randomDigit = 0;

        while (randomDigit == 0) {
            randomDigit = cyfra.nextInt(10);
        }

        return randomDigit;
    }

    public char charCyfraRoznaOdZera() {
        Random cyfra = new Random();
        int randomDigit = 0;

        while (randomDigit == 0) {
            randomDigit = cyfra.nextInt(10);
        }

        char[] tablica = String.valueOf(randomDigit).toCharArray();

        return tablica[0];
    }

}
