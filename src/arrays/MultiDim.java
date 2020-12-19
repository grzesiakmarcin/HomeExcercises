package arrays;

public class MultiDim {
    public static void main(String[] args) {

        int[][] mojaTablica;

        mojaTablica = new int[][]{ {1, 2, 13, 4},
                                   {2, 33, 25,4},
                                   {55,533,12,15},
                                   {21, 11, 33,12}};


        for (int rzad=0; rzad< mojaTablica.length;rzad++){
           for (int kolumna=0; kolumna< mojaTablica.length;kolumna++){
               System.out.print(mojaTablica[rzad][kolumna]+" ");
           }
            System.out.println();

        }


    }
}
