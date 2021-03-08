package pakietDoPierdol;

import java.util.Random;

public class Klasa {

    public static void main(String[] args) {


        int[]tablica1 = {11,12,13,14};
        int[]tablica2 = {21,22,23,24};


//        for(int i =0; i< tablica1.length;i++){
//
//            System.out.println(tablica1[i]);
//
//            for (int j=i+1; j< tablica2.length;j++){
//                System.out.println(tablica2[j]);
//            }
//        }

//        for(int element: tablica2){
//            System.out.println(element);
//        }
//
//        for (int i =0; i< tablica2.length;i++){
//            System.out.println(tablica2[i]);
//        }
//



        Random random = new Random(8);
       int ij = random.nextInt();
        System.out.println("nasz random "+ ij);
//
//        Random rando2m = new Random(100000);
//        System.out.println(rando2m.nextInt(5)); // it may print 0, 1, 2, 3, 4
//        System.out.println(rando2m.nextInt(5)); // it may print 0, 1, 2, 3, 4
//
//
//        for (int i =0; i<50;i++) {
//
//            String generatePin = String.format("%04d", random.nextInt(10000));
//        //    System.out.println(generatePin);
//
//        }


    }
}
