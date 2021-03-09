package multidimensionalArrays;

public class InnaKlasa {
    public static void main(String[] args) {

        int[][] cinema = {
                {1, 0, 0, 0},
                {0, 1, 1, 1},
                {1, 1, 1, 1}
        };
        int howManyTickersNeeded = 4;
        boolean anotherSeatIsFree = false;
        boolean anotherSeatIsNOTFree = false;
        boolean stopSeekingForRow = false;
        boolean answerPrinted = false;
        int currentrow = 0;
        int zliczWolne = 0;
        int maxFreeSeats = -1;
        int rowForMaxFreeSeats = 0;


        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length - 1; j++) {


                anotherSeatIsFree = cinema[i][j] == 0 && cinema[i][j + 1] == 0;
                anotherSeatIsNOTFree = cinema[i][j] == 0 && cinema[i][j + 1] != 0;

                if (anotherSeatIsFree) {
                    if (zliczWolne == 0) {
                        zliczWolne++;
                    }

                    zliczWolne++;

                    if (zliczWolne > maxFreeSeats) {
                        maxFreeSeats = zliczWolne;
                        rowForMaxFreeSeats = currentrow;
                    }


                    System.out.println("rzad: " + i + " miejsce: " + j + " i " + (j + 1));

                }
                if (anotherSeatIsNOTFree) {
                    zliczWolne = 0;
                }


            }


            if (anotherSeatIsNOTFree) {
                zliczWolne = 0;
            }


            currentrow++;
            zliczWolne = 0;
        }

//        System.out.println("rzad: " + (rowForMaxFreeSeats + 1) + " naliczono wolnych kolo siebie: " + maxFreeSeats);

        if (howManyTickersNeeded <= maxFreeSeats && stopSeekingForRow == false) {
            System.out.println(rowForMaxFreeSeats + 1);
            stopSeekingForRow = true;
            answerPrinted = true;

        } else if (stopSeekingForRow == false && answerPrinted == false) {
            System.out.println(0);
        }
    }
}
