package CM;
import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Resources rs = new Resources();

            rs.toStr();

        System.out.println("Write action (buy, fill, take): ");
    switch (sc.next()) {
        case "fill":
            Fill fill = new Fill();


            break;
        case "take":
            Take take = new Take();
            take.wydaj();

            break;
        case "buy":
            Buy buy = new Buy();

            break;

        default:
            System.out.println("Unsuitable action, system shtu down");
            System.exit(1);
    }


    // ile wynosza standardowe ilosci kawy
    int waterStandard = 200;
    int milkStandard = 50;
    int coffeeStandard = 15;

    // zasoby naszej maszyny

    int water = sc.nextInt();
    int milk = sc.nextInt();
    int coffeeBeans = sc.nextInt();


    // ilosc możliwej do zrobienia kawy:

    int ileKawZWody = water / waterStandard;
    int ileKawZMleka = milk / milkStandard;
    int ileKawZZiaren = coffeeBeans / coffeeStandard;

    // okreslenie na ile kaw mozemy zrobic;

    int iloscKaw = 0;

    if (ileKawZWody <= ileKawZMleka && ileKawZWody < +ileKawZZiaren) {
        iloscKaw = ileKawZWody;
    } else if (ileKawZMleka <= ileKawZWody && ileKawZMleka <= ileKawZZiaren) {
        iloscKaw = ileKawZMleka;
    } else if (ileKawZZiaren <= ileKawZWody && ileKawZZiaren <= ileKawZMleka) {
        iloscKaw = ileKawZZiaren;

    }

    int coffeeOrder = sc.nextInt();

    if (coffeeOrder > iloscKaw) {
        System.out.println("No, I can make only " + (iloscKaw) + " cup(s) of coffee");
    } else if (coffeeOrder == iloscKaw) {
        System.out.println("Yes, I can make that amount of coffee");
    } else if (coffeeOrder < iloscKaw) {
        System.out.println("Yes, I can make that amount of coffee (and even " + (iloscKaw - 1) + " more than that)");
    }


}


}

class Buy {


    // ile wynosza standardowe ilosci kawy espresso
    int waterStandardEspresso = 250;
    int milkStandardEspresso = 0;
    int coffeeStandardEspresso = 16;
    int priseEspresso = 4;

    // ile wynosza standardowe ilosci kawy latte
    int waterStandardLatte = 350;
    int milkStandardLatte = 75;
    int coffeeStandardLatte = 20;
    int priseLatte = 7;

    // ile wynosza standardowe ilosci kawy cappuccino
    int waterStandardCappucino = 200;
    int milkStandardCappucino = 100;
    int coffeeStandardCappucino = 12;
    int priseCappucino = 6;


    Scanner sc = new Scanner(System.in);

    public void buy() {

        System.out.println("What do you want to buy? 1-espresso, 2-latte, 3-cappuccino:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                // espresso;

            case 2:
                // latte,
            case 3:
                //cappuccino
        }
    }


}

class Fill {
}

class Take {

    public void wydaj() {
        System.out.println("I gave you " + Resources.money);
        Resources.money = 0;
        System.out.println("The coffee machine has: ");
        System.out.println(Resources.water + " of water");
        System.out.println(Resources.milk + " of milk");
        System.out.println(Resources.coffeeBeans + " of coffee beans");
        System.out.println(Resources.disposaleCups + " of disposable cups");
        System.out.println(Resources.money + " of money");

    }
}

class Resources {
    static int money = 550;
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int disposaleCups = 9;

   public void toStr(){
       System.out.println("The coffee machine has:");
       System.out.println(Resources.water + " of water");
       System.out.println(Resources.milk + " of milk");
       System.out.println(Resources.coffeeBeans + " of coffee beans");
       System.out.println(Resources.disposaleCups + " of disposable cups");
       System.out.println(Resources.money + " of money");
   }



}
