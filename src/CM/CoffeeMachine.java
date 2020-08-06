package CM;

import java.util.Scanner;


public class CoffeeMachine {

    static int money = 550;
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int disposaleCups = 9;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        while (true) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String choice = sc.next();

            switch (choice) {
                case "fill":
                    System.out.println("fill");


                    break;
                case "take":
                    System.out.println("take");

                    break;
                case "buy":
                    buymethod();
                    break;
                case "remaining":

                    break;
                case "exit":
                    System.exit(1);
                    break;

            }

        }

        }

       static void fill (){
           System.out.println("fill hahah");

    }

    static void buymethod(){
        System.out.println("wpisz 1,2,back");
        while (true){
            Scanner sc = new Scanner(System.in);
            String anotherChoice = sc.next();
            System.out.println("wpisz 1,2,back");

            switch (anotherChoice){
                case "1":

                    if(anotherChoice.equals("0")) {
                        System.out.println(0);
                    }
                    else {
                        System.out.println(1);
                    }
                    break;
                case "2":
                    System.out.println(2);
                    break;
                case "back":
                    return;

            }





        }



    }

}



