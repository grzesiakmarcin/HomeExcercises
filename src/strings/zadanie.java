package strings;

import java.util.Scanner;

public class zadanie {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input = "aaaabbcaa";
        int counter=1;

        char[] tablicaZnaczkow = input.toCharArray();



        for (int i=0; i<= tablicaZnaczkow.length-1;i++){

            if (tablicaZnaczkow[i]==tablicaZnaczkow[i+1]){
                counter++;


            }

            if(tablicaZnaczkow[i]!=tablicaZnaczkow[i+1]){
                System.out.print(tablicaZnaczkow[i]+""+counter);
                counter=1;

            }



        }


        //
//        for (int i=0; i< tablicaZnaczkow.length-1;i++){
//
//            if(tablicaZnaczkow[i]==tablicaZnaczkow[i+1]){
//                counter++;
//            }
//            if (tablicaZnaczkow[i]!=tablicaZnaczkow[i+1]){
//                System.out.print(tablicaZnaczkow[i]+counter);
//                counter=1;
//            }
//
//        }

    }

}
