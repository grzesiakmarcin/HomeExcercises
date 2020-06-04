package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {

        //tworzymy liste

        List<String> mojaLista = new ArrayList<String>();
        mojaLista.add("Ola");
        mojaLista.add("Ksenia");
        mojaLista.add("Dawid");
        mojaLista.add("Magda");
        mojaLista.add("Zbyszek");
        mojaLista.add("Andrzej");
        mojaLista.add("Marcelina");
        mojaLista.add("Ola");


        System.out.println(mojaLista); // bez sortowania

        Collections.sort(mojaLista);
        System.out.println(mojaLista);

    }

}
