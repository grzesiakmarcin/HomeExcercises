package imputStreams;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner("USD J  PY AUD SGD HKD CAD CHF GBP EURO INR");
        int count = 0;
        String input = sc.nextLine();
        String[] currencyArray = input.split(" ");

        for (String element : currencyArray) {
            if (element.equals(" ")) {

                System.out.println("znaleziono spacje");

            }
                    }
        System.out.println(count);
        System.out.println("element nr 3: "+currencyArray[2]);

        if(currencyArray[2]==" "){
            System.out.println("mamy to");
        }

        if(!currencyArray[2].equals(" ")){
            System.out.println("chuj to");
        }

        System.out.println(currencyArray[1]);
        if(currencyArray[1].equals("J")){
            System.out.println("mamy J");
        }

    }
}