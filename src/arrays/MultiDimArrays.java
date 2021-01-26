package arrays;

public class MultiDimArrays {

    public static void main(String[] args) {

//        Napisz metodę pobierającą dwuelementową tablicę liczb i zwracający ich sumę.
//        Napisz program pobierający trójelementową tablicę liczb i zwracający największą liczbę.


        myClass zliczaj = new myClass();    // w innej klasie mam metody do zliczania


        int[] tablicaOne = {2, 4, 3, 6};

        zliczaj.getSum(tablicaOne);
        zliczaj.getHighest(tablicaOne);

/**
 * ponizej deklararowanie elementów tablicy na dwa sposoby
 */
        int[][] jakasTablica;

        jakasTablica = new int[2][4];


        int[][] innaTablica = {{1, 2, 3},
                {5, 6, 7},
                {12, 43, 42}};


        int[][] jeszczeInnaTablica = new int[4][];


        jeszczeInnaTablica[0] = new int[]{2, 43, 5};
        jeszczeInnaTablica[1] = new int[]{1, 323, 2};
        jeszczeInnaTablica[2] = new int[]{3, 4, 66};
        jeszczeInnaTablica[3] = new int[]{54, 2, 1};


        //wydrukowanie zawartosci poszczegolnych wierszy

        for (int wiersz = 0; wiersz <= jeszczeInnaTablica.length - 1; wiersz++) {
            for (int pozycja = 0; pozycja < jeszczeInnaTablica.length - 1; pozycja++)
                System.out.print(jeszczeInnaTablica[wiersz][pozycja] + " ");


        }

        System.out.println();


        String[][] mojeStingi = {{"Aniela", "Ignac"},
                {"Ala", "Leszek"},
                {"Ula", "Stasiu"},
                {"Teresa", "Czesław"},
        };

        for (int i =0; i < mojeStingi.length;i++) {
            for (int j =1; j < 2; j++) {
                System.out.print(mojeStingi[i][j]+" ");

            }
            System.out.println( );
        }


    }
}


class myClass {


    public void getSum(int[] array) {
        int liczymy = 0;

        for (int incik : array) {
            liczymy = liczymy + incik;


        }

        System.out.println("no zobaczmy czy dziala " + liczymy);

    }


    public void getHighest(int[] array) {
        int higghest = 0;

        for (int incik : array) {
            if (higghest < incik) {
                higghest = incik;
            }
        }
        System.out.println(higghest);


    }


    public void getSumMulti(int[][] array) {
        int count = 0;

        for (int wiersz = 0; wiersz > array.length - 1; wiersz++) {

            for (int pozycja = 0; pozycja > array.length - 1; wiersz++) {
                System.out.println(array[wiersz][pozycja]);
                count = count + pozycja;
            }


        }


        System.out.println(count);

    }

}














