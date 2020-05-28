package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListExercises {
    public static void main(String[] args) {
        LinkedList<Integer> listaPowiazana = new LinkedList<Integer>();

        Random randomNumber = new Random();


        // dodamy sobie teraz pozycje do mojej linked listy
        for (int i =0; i<5000;i++) {
            listaPowiazana.add(randomNumber.nextInt(2000));
        }

        // teraz zmierzymy ile czasu zajmnie wypisanie jej elementow
         float start = System.currentTimeMillis();

        for (Integer element: listaPowiazana) {
            System.out.println(element);

        }

        float stop = System.currentTimeMillis();



        //AnotherClass.iteratorList(listaPowiazana);


        System.out.println("Czas na wydrukowanie elementów listy: " + (stop - start));











    }
}


class AnotherClass{
    public static void iteratorList(LinkedList<?> lista){
        Iterator iteratorListy = lista.iterator();
        float start = System.currentTimeMillis();

        while (iteratorListy.hasNext()){

          //  System.out.println(lista.get());
        }
        float stop = System.currentTimeMillis();
        System.out.println("czas potrzebny to " +(stop-start));

    }
}
