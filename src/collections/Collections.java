package collections;

import java.util.*;

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


        ArrayList<Integer> mojaLista = new ArrayList<Integer>();
        mojaLista.add(50);
        mojaLista.add(11);
        mojaLista.add(43);
        mojaLista.add(555);

        System.out.println(mojaLista);
        Object[] mojaTablica= mojaLista.toArray();

        for (Object incik:mojaTablica) {
            System.out.print(incik +" ");
        }

        mojaLista.set(0,1);
        mojaLista.add(0,1122);

        System.out.println(mojaLista);
        for (Integer incik: mojaLista
             ) {
            System.out.println(incik);
        }

        //  linked list vs array list


        ArrayList<Integer> mojaArrayLista = new ArrayList<Integer>();
        LinkedList<Integer> mojaLinkedLista = new LinkedList<Integer>();


        Random rand= new Random();
        Long start = System.currentTimeMillis();


        for (int j =0; j<100000; j++){
            mojaArrayLista.add(rand.nextInt());

        }
        Long stop = System.currentTimeMillis();
        System.out.println("Rozmiar arrayListy "+mojaArrayLista.size());
        System.out.println(stop-start);

        start = System.currentTimeMillis();


        for (int j =0; j<100000; j++){
            mojaLinkedLista.add(rand.nextInt());

        }
        stop=System.currentTimeMillis();

        System.out.println("Rozmiar  linked listy: " + mojaLinkedLista.size());
        System.out.println(stop-start);

        start=System.currentTimeMillis();
        for (int i = 0; i < 1200; i++){
            mojaArrayLista.add(200+i,rand.nextInt());
        }
        stop=System.currentTimeMillis();

        System.out.println(stop-start + " Czas dodania 1200 elementow do ArrayListy");


        start=System.currentTimeMillis();
        for (int i = 0; i < 1200; i++){
            mojaLinkedLista.add(200+i,rand.nextInt());
        }
        stop=System.currentTimeMillis();

        System.out.println(stop-start + " Czas dodania 1200 elementow do LinkedListy");


    }
}