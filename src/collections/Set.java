package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();

        for (int i=0; i<=10;i++){
            sortedSet.add(i);
        }

        SortedSet<Integer> subSet = sortedSet.subSet(3, 7);

        int first = sortedSet.first();

        System.out.println("incik first: " + first);


        System.out.println(subSet);
//
//        for (Integer element: sortedSet
//             ) {
//            System.out.println(element);
//
//        }

    }
}
