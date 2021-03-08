package multidimensionalArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[][] cinema = {
                {0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1},
                {1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0},
                {1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0},
                {1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1},
                {0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0},
                {1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0},
                {0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0},
                {1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1},
                {0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1},
                {1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0},
                {1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1},
                {0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}};


        int rows = 16;
        int column = 18;


        int howManyTickers = 8;
        System.out.println("potrzebujemy wolnych kolo siebie: " + howManyTickers);
        int counter = 0;
        int moreThanOne = 0;


        int currentRow = 0;
        boolean stopSearching = false;
        int answer = 0;


        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length - 1; j++) {

                if (howManyTickers == 1) {
                    if (cinema[i][j] == 0) {

                        if (stopSearching != true) {
                            answer = (currentRow + 1);
                        }
                        stopSearching = true;
                    }
                } else {


                    if (i != currentRow) {
                        counter = 0;
                        moreThanOne = 0;
                        currentRow++;


                    } else {

                        if (cinema[i][j] == 0) {
                            counter++;
                            if (cinema[i][j + 1] == 0) {
                                moreThanOne++;
                                if ((moreThanOne + 1) == howManyTickers) {


                                    if (stopSearching != true) {
                                        answer = (currentRow + 1);
                                    }
                                    stopSearching = true;


                                }

                            }
                        }
                    }


                }

            }
        }


        System.out.println(answer);
        //  System.out.println(answer != 0 ? answer : 0);

    }
}

