package projekty;

import java.util.Scanner;

public class Gra {
    public static void main(String[] args) {

        int cows = 0;
        int bulls = 0;

        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        String guess = sc.next();

        int[] passArray = new int[4];
        int[] guessArray = new int[4];

        passArray = new ArrayMaker().makeArrayFromString(passArray, password);
        guessArray = new ArrayMaker().makeArrayFromString(guessArray, guess);


    }


}
