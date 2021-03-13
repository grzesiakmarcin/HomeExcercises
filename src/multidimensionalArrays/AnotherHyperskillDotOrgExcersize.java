package multidimensionalArrays;

import java.util.Scanner;

public class AnotherHyperskillDotOrgExcersize {
    public static void main(String[] args) {


        int[][] array = {

                {0, 3, 2, 4},
                {2, 3, 5, 5},
                {5, 1, 2, 3}
        };



        int max = Integer.MIN_VALUE;
        int positionN = Integer.MAX_VALUE;
        int positionM = Integer.MAX_VALUE;

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {


                if (array[i][j] >= max) {
                    max= array[i][j];

                    positionN = i;
                    positionM = j;


                }
            }

        }

        System.out.println(positionN + " " + positionM);

    }


}
