package poligon;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++)
            System.out.print(new RandomCharacter().zZakresu(36));



    }

}

class RandomCharacter {
    StringBuilder sb = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public String generuj(int howMany) {


        for (int i = 0; i < howMany; i++) {
            char c = (char) random.nextInt((93) + 33);


            sb.append(c);
        }

        return String.valueOf(sb);
    }


    public String randomLetter(int homMany) {
        Random rd = new Random();
        String abc = "abcdefghijklmnoprstuwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= homMany; i++) {
            char letter = abc.charAt(rd.nextInt(abc.length()));
            sb.append(letter);
        }


        return String.valueOf(sb);
    }

    public char zZakresu(int zakres) {
        Random rd = new Random();
        String abc = "0123456789abcdefghijklmnopqrstuvwxyz";//36

        char[] array = abc.toCharArray();

        //char letter = abc.charAt(rd.nextInt(abc.length()));
        return abc.charAt(rd.nextInt(zakres));

    }

}



