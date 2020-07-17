package CM;
import java.util.Scanner;


public class CoffeeMachine {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Resources rs = new Resources();

            rs.stats();

            System.out.println("Write action (buy, fill, take): ");
            switch (sc.next()) {
                case "fill":
                    Fill fill = new Fill();
                    fill.fillResources(rs);
                    rs.stats();

                    System.exit(1);
                case "take":
                    Take take = new Take();
                    take.wydaj(rs);

                    break;
                case "buy":
                    Buy buy = new Buy();
                    buy.buyCoffee(rs);

                    break;

                default:

                    System.exit(1);
            }
            sc.close();


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
        Resources Rs = new Resources();

        public Resources buyCoffee(Resources rs) {

            System.out.println("What do you want to buy? 1-espresso, 2-latte, 3-cappuccino:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: //espresso
                    orderEspresso(rs);
                    Rs.stats();
                    System.exit(1);

                case 2: // latte,
                    orderLatte(rs);
                    Rs.stats();
                    System.exit(1);

                case 3://cappuccino
                    orderCappucino(rs);
                    Rs.stats();
                    System.exit(1);

            }
            sc.close();
            return  rs;

        }

        public Resources orderEspresso(Resources rs) {
            Rs.setMoney(Rs.getMoney() + priseEspresso);
            Rs.setWater(Rs.getWater() - waterStandardEspresso);
            Rs.setCoffeeBeans(Rs.getCoffeeBeans() - coffeeStandardEspresso);
            Rs.setDisposaleCups(Rs.getDisposaleCups() - 1);

            return rs;
        }

        public Resources orderLatte(Resources rs) {
            Rs.setMoney(Rs.getMoney() + priseLatte);
            Rs.setWater(Rs.getWater() - waterStandardLatte);
            Rs.setCoffeeBeans(Rs.getCoffeeBeans() - coffeeStandardLatte);
            Rs.setMilk(Rs.getMilk() - milkStandardLatte);
            Rs.setDisposaleCups(Rs.getDisposaleCups() - 1);
            return rs;
        }

        public Resources orderCappucino(Resources rs) {
            Rs.setMoney(Rs.getMoney() + priseCappucino);
            Rs.setWater(Rs.getWater() - waterStandardCappucino);
            Rs.setCoffeeBeans(Rs.getCoffeeBeans() - coffeeStandardCappucino);
            Rs.setMilk(Rs.getMilk() - milkStandardCappucino);
            Rs.setDisposaleCups(Rs.getDisposaleCups() - 1);

            return rs;
        }


    }

    class Fill {
        Scanner sc = new Scanner(System.in);


        public Resources fillResources(Resources rs) {

            System.out.println("Write how many ml of water do you want to add:");
            sc.nextInt();
           // rs.setWater(rs.getWater()+sc.nextInt());

            System.out.println("Write how many ml of milk do you want to add: ");
          //  rs.setMilk(rs.getMilk() + sc.nextInt());
            sc.nextInt();

            System.out.println("Write how many grams of coffee beans do you want to add: ");
         //   rs.setCoffeeBeans(rs.getCoffeeBeans() + sc.nextInt());
            sc.nextInt();

            System.out.println("Write how many disposable cups of coffee do you want to add: ");
          //  rs.setDisposaleCups(rs.getDisposaleCups() + sc.nextInt());
            sc.nextInt();


            return rs;

        }



    }

    class Take {



        public Resources  wydaj(Resources rs) {

            System.out.println("I gave you " + rs.getMoney());
            rs.setMoney(0);
            System.out.println("The coffee machine has: ");
            System.out.println(rs.getWater() + " of water");
            System.out.println(rs.getMilk() + " of milk");
            System.out.println(rs.getCoffeeBeans() + " of coffee beans");
            System.out.println(rs.getDisposaleCups() + " of disposable cups");
            System.out.println(rs.getMoney() + " of money");

            return rs;


        }
    }

    class Resources {
        private int money = 550;
        private int water = 400;
        private int milk = 540;
        private int coffeeBeans = 120;
        private int disposaleCups = 9;

        public void stats() {
            System.out.println("The coffee machine has:");
            System.out.println(water + " of water");
            System.out.println(milk + " of milk");
            System.out.println(coffeeBeans + " of coffee beans");
            System.out.println(disposaleCups + " of disposable cups");
            System.out.println(money + " of money" + "\n");
        }

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public int getWater() {
            return water;
        }

        public void setWater(int water) {
            this.water = water;
        }

        public int getMilk() {
            return milk;
        }

        public void setMilk(int milk) {
            this.milk = milk;
        }

        public int getCoffeeBeans() {
            return coffeeBeans;
        }

        public void setCoffeeBeans(int coffeeBeans) {
            this.coffeeBeans = coffeeBeans;
        }

        public int getDisposaleCups() {
            return disposaleCups;
        }

        public void setDisposaleCups(int disposaleCups) {
            this.disposaleCups = disposaleCups;
        }
    }
