package multidimensionalArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[][] cinema = {

                {1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0},
                {1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1},
                {0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1},
                {0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1},
                {0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1},
                {0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0},
                {1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0},
                {1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
                {1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0},
                {1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1},
                {0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1},
                {1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0}};

        int howManyTickersNeeded = 5;
        int avaliableSeatsNextToEachOther = 0;
        int currentRow = 0;
        boolean stopSearching = false;
        boolean anotherSeatIsFree = false;
        int seekedRow = 0;
        int max = -1;

        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length - 1; j++) {

                if (howManyTickersNeeded == 1) {
                    if (cinema[i][j] == 0) {

                        if (stopSearching != true) {
                            seekedRow = (currentRow + 1);
                        }
                        stopSearching = true;
                    }
                } else {


                    if (i != currentRow) {
                        avaliableSeatsNextToEachOther = 0;
                        currentRow++;

                    } else {

                        anotherSeatIsFree = cinema[i][j] == 0 && cinema[i][j + 1] == 0;


                        if (anotherSeatIsFree == true) {

                            avaliableSeatsNextToEachOther++;

                            if (avaliableSeatsNextToEachOther == 1) {
                                avaliableSeatsNextToEachOther++;
                            }


                            if (avaliableSeatsNextToEachOther > max) {
                                max = avaliableSeatsNextToEachOther;
                            }

                            if (max == howManyTickersNeeded) {
                                seekedRow = (currentRow + 1);
                            }


                        } else {
                            avaliableSeatsNextToEachOther = 0;
                        }

                    }


                }

            }
        }


        System.out.println(seekedRow);

    }
}

