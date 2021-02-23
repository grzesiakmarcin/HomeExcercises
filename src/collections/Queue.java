package collections;


import java.util.ArrayDeque;

public class Queue {
    public static void main(String[] args) {

        java.util.Queue<String> mojaKolejka = new ArrayDeque<>();

        mojaKolejka.add("pierwszy");
        mojaKolejka.add("drugi");
        mojaKolejka.add("trzeci");
        mojaKolejka.add("czwarty");
        mojaKolejka.add("piaty");

        System.out.println(mojaKolejka.size());

        System.out.println("pierwszy w kolejce: " + mojaKolejka.peek());
        System.out.println("usunieto: " + mojaKolejka.remove());

        System.out.println(mojaKolejka.size());
        System.out.println("pierwszy w kolejce: " + mojaKolejka.peek());

        System.out.println(mojaKolejka);

        System.out.println(mojaKolejka.contains("czwarty"));

        String[] array = new String[mojaKolejka.size()];

        mojaKolejka.toArray(array);


        for (String ele : array
        ) {
            System.out.println(ele);

        }


    }
}
