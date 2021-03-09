package multidimensionalArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[][] cinema = {
                {0, 0, 0, 1},//3
                {0, 0, 1, 0,},//2
                {0, 1, 0, 0},//2
                {1, 0, 0, 0},//3
                {0, 0, 0, 0,}};//4


        int howManyTickersNeeded = 4;
        int avaliableSeatsNextToEachOther = 0;

        int currentRow = 0;
        boolean stopSearching = false;
        boolean anotherSeatIsFree=false;
        int seekedRow = 0;
        int max=-1;


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

                        anotherSeatIsFree = cinema[i][j] == 0 && cinema[i][j+1] == 0;


                        if (anotherSeatIsFree == true) {

                            avaliableSeatsNextToEachOther++;

                            if(avaliableSeatsNextToEachOther==1){
                                avaliableSeatsNextToEachOther++;}


                            if (avaliableSeatsNextToEachOther > max) {
                                max = avaliableSeatsNextToEachOther;
                            }

                            if(max==howManyTickersNeeded&& stopSearching!=true){
                                seekedRow=(currentRow+1);
                                stopSearching=true;
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
//        int howManyTickersNeeded = 4;
//        boolean anotherSeatIsFree = false;
//        boolean anotherSeatIsNOTFree = false;
//        boolean stopSeekingForRow = false;
//        boolean answerPrinted = false;
//        int currentrow = 0;
//        int zliczWolne = 0;
//        int maxFreeSeats = -1;
//        int rowForMaxFreeSeats = 0;
//
//
//        for (int i = 0; i < cinema.length; i++) {
//            for (int j = 0; j < cinema[i].length - 1; j++) {
//
//
//                anotherSeatIsFree = cinema[i][j] == 0 && cinema[i][j + 1] == 0;
//                anotherSeatIsNOTFree = cinema[i][j] == 0 && cinema[i][j + 1] != 0;
//
//                if (anotherSeatIsFree) {
//                    if (zliczWolne == 0) {
//                        zliczWolne++;
//                    }
//
//                    zliczWolne++;
//
//                    if (zliczWolne > maxFreeSeats) {
//                        maxFreeSeats = zliczWolne;
//                        rowForMaxFreeSeats = currentrow;
//                    }
//
//
//                    System.out.println("rzad: " + i + " miejsce: " + j + " i " + (j + 1));
//
//                }
//                if (anotherSeatIsNOTFree) {
//                    zliczWolne = 0;
//                }
//
//
//            }
//
//
//            if (anotherSeatIsNOTFree) {
//                zliczWolne = 0;
//            }
//
//
//            currentrow++;
//            zliczWolne = 0;
//        }
//
////        System.out.println("rzad: " + (rowForMaxFreeSeats + 1) + " naliczono wolnych kolo siebie: " + maxFreeSeats);
//
//        if (howManyTickersNeeded <= maxFreeSeats && stopSeekingForRow == false) {
//            System.out.println(rowForMaxFreeSeats + 1);
//            stopSeekingForRow = true;
//            answerPrinted = true;
//
//        } else if (stopSeekingForRow == false && answerPrinted == false) {
//            System.out.println(0);
//        }

