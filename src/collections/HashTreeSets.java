package collections;

import objects.Car;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class HashTreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet= new TreeSet<Integer>();
        HashSet<Integer> hashSet= new HashSet<Integer>();


        Kodzik kd = new Kodzik();

        kd.zaladujTSet(treeSet,10000,110);
        kd.zaladujHSet(hashSet, 10000,110);

// wynik obarczony błędem - tworząc nowe elementy dochodzi do sprawdzenia czy nie są one zduplikowane - w tym miejscu możliwe różnice
// co do zasady - TreeSet jest wolniejszy

        Set<Car> carTreeSet = new TreeSet<Car>();
//
//        carTreeSet.add(new Car("BMW 4", " kompot",2019,100,123456789));
//        carTreeSet.add(new Car("BMW 3","kombi",2005,115, 123456789));
//        carTreeSet.add(new Car("Skoda Octavia","kombi",2004,115, 123456789));
//        carTreeSet.add(new Car("BMW 3","kombi",2005,115, 12345679));
//        carTreeSet.add(new Car("BMW 3","kombi",2005,115, 123456789));
//        carTreeSet.add(new Car("BMW 5","kombi",2005,115, 123456789));
//        carTreeSet.add(new Car("Mercedes C","kombi",2003,143, 123456789));



        for (Integer incik: treeSet) {
            System.out.println();

        }



        for (int i=0;i<treeSet.size();i++){
            System.out.println();
        }

    }





}
class Kodzik{
    public void zaladujHSet(HashSet<Integer> set, int ilosc, int bound) {
        long start = System.currentTimeMillis();
        long stop = 0;

        Random random = new Random();

        for (int i = 0; i < ilosc; i++) {

            set.add(random.nextInt(bound));
            stop += System.currentTimeMillis() - start;


        }


        System.out.println("czas utworzenia HS wyniusł: " + stop+" ms.");


    }

    public void zaladujTSet(TreeSet<Integer> set, int ilosc, int bound) {
        long start = System.currentTimeMillis();
        long stop = 0;

        Random random = new Random();

        for (int i = 0; i < ilosc; i++) {

            set.add(random.nextInt(bound));
            stop += System.currentTimeMillis() - start;


        }


        System.out.println("czas utworzenia TS wyniusł: " + stop+" ms.");


    }


}
