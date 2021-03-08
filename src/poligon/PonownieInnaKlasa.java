package poligon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PonownieInnaKlasa {
    public static void main(String[] args) throws FileNotFoundException {
        FileOfMine instancja = new FileOfMine();

        System.out.println(9/2+1);


        instancja.przetrzepPopulacje();

    }

}

class FileOfMine {
    public static void znajdzNajwieksza() throws FileNotFoundException {
        List<Integer> mojaLista = new ArrayList<>();

        String pathToFile = "D:\\dataset_91007.txt";
        int najwiekszy = Integer.MIN_VALUE;
        int innyRezultat = 0;
        int ileCyfr = 0;
        File plik = new File(pathToFile);
        Scanner sc = new Scanner(plik);
        while (sc.hasNext()) {
            mojaLista.add(sc.nextInt());
            if (sc.nextInt() > najwiekszy) {
                najwiekszy = sc.nextInt();
                ileCyfr++;
            }
        }

        System.out.println("rozmiar listy: " + Collections.max(mojaLista));


        System.out.println("Najwieksza wartosc = " + najwiekszy + "\n Counter: " + ileCyfr + "\n A teraz z listy: " + innyRezultat);


    }


    public void przetrzepPopulacje() {
        String filePath = "D:\\dataset_91069.txt";
        File myNewFile = new File(filePath);
        List<String> mojaLista = new ArrayList<>();
        List <Double>docelowaLista = new ArrayList<>() ;





    }
}
