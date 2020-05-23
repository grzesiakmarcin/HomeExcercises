package collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {


    public static void main(String[] args) {


        List<String> lista = new ArrayList<String>();

        //dodajemy ciągi znaków
        lista.add("Asia");
        lista.add("Basia");
        lista.add("Krzysiek");
        lista.add("Wojtek");

//sprawdzamy rozmiar listy

        System.out.println("Rozmiar listy to: " + lista.size());

//usuwamy obiekt "Asia" i sprawdzamy rozmiar
        lista.remove("Asia");

        System.out.println("Rozmiar listy to: " + lista.size());

//usuwamy obiekt zajmujący 2 miejsce, czyli o indeksie 1 - u nas "Krzysiek"
        lista.remove(1);

        System.out.println("Rozmiar listy to: " + lista.size());

//na koniec przypiszmy pierwszy element listy zmiennej imie i wyświetlmy go
        //musimy użyć rzutowania, ponieważ inaczej próbowalibyśmy przypisać Object do String

        String imie = (String) lista.get(0);
        System.out.println("Pierwszy element listy to: " + imie);



        List myList = new ArrayList();
        myList.add("Magda" );
        myList.add("Ola" );
        myList.add("Ksenia" );

        for (Object stringus: myList) {
            System.out.println((String)stringus);
        }



    }
}