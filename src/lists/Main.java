package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaStringow = new ArrayList<String>(50);
        listaStringow.add("ala");
        listaStringow.add("Kasia");
        listaStringow.add("Leszek");


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ania");
        arrayList.add("Angela");
        arrayList.add("Anita");
        arrayList.add("Anastazja");
        arrayList.add("Aurelia");
        arrayList.add("Antonia");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Zbyszek");
        linkedList.add("Janusz");
        linkedList.add("Mariusz");
        linkedList.add("Maciej");
        linkedList.add("Wincent");
        linkedList.add("Zygmunt");


      Mechanizmy.transferAllElements(linkedList,arrayList);

        Mechanizmy.wdukujLinked(linkedList);
        Mechanizmy.wdukujArray(arrayList);


    }
}

class Person {
    String name;
    String lastName;
    int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }


}

class Mechanizmy {
    public static void transferAllElements(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        LinkedList<String> nowaLinked = new LinkedList<String>(linkedList);
        ArrayList<String> nowaArray = new ArrayList<String>(arrayList);

        while (arrayList.size()!=0) {
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.remove(i);
            }
        }

        while (linkedList.size()!=0) {
            for (int i =0; i<linkedList.size();i++) {
                linkedList.remove(i);

            }
        }

        for (int i = 0; i < nowaLinked.size(); i++) {
            arrayList.add(i, nowaLinked.get(i));
        }

        for (int i = 0; i < nowaArray.size(); i++) {
            linkedList.add(i, nowaArray.get(i));
        }


    }


    public static void wdukujLinked(LinkedList<String> linkedLista) {

        System.out.println("=============== Drukuje linkedListe==============");
        for (String element : linkedLista
        ) {
            System.out.println(element);

        }

        System.out.println("=============== Koniec linkedListy==============");
    }



    public static void wdukujArray(ArrayList<String> arrayList) {

        System.out.println("=============== Drukuje arrayListe==============");
        for (String element : arrayList
        ) {
            System.out.println(element);

        }

        System.out.println("=============== Koniec arrayListy==============");
    }
}