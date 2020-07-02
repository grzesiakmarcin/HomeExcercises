package pakietDoPierdol;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int waterStandard = 200;
        int milkStandard = 50;
        int coffeeStandard = 15;

        int water = 60_00;
        int milk = 15_000;
        int coffee = 4_500;




        System.out.println("Write how many ml of water the coffee machine has: ");
        System.out.println(water);
        System.out.println("Write how many ml of milk the coffee machine has: ");
        System.out.println(milk);
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        System.out.println(coffee);
        System.out.println("Write how many cups of coffee you will need: ");
        int needed = sc.nextInt();

        int waterNeeded = needed*waterStandard;
        int milkNeeded = needed*milkStandard;
        int coffeeNeeded = needed*coffeeStandard;
        int countNeeded = needed;
        int howManyWeCan=0;


        boolean exaclyOneEnough =
                waterNeeded == water &&
                milkNeeded == milk &&
                coffeeNeeded  == coffee;

        boolean moreEnough = waterNeeded<= water&&
                              milkNeeded <= milk &&
                              coffeeNeeded <= coffee;

        for(int i =needed; i>0; i--){
            if((water-(waterStandard*i)>=0)&&(milk-(milkStandard*i)>=0) &&(coffee-(coffeeStandard*i)>=0)){
                howManyWeCan=i;
                break;
            }
        }





        if(exaclyOneEnough){System.out.println("Yes, I can make that amount of coffee");}
        else if (moreEnough){
            System.out.println("Yes, I can make that amount of coffee (and even "+(howManyWeCan-1)+" more than that");
        }
        else{
            System.out.println("No, I can make only "+howManyWeCan +" cup(s) of coffee");
        }
    }



}

