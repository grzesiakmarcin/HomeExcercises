package objects;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("BMW 3","kombi",2005,115,131321);
        Car car2 = new Car("Kia Ceed","shitbox",2015,95,5654654);
        Car car3 = new Car("BMW 5","sedan",1999,171,654654665);
        Car car4 = new Car("BMW 3","kombi",2005,115,12132132);
        Car car5 = new Car("Skoda Octavia","kombi",2020,110,21321);

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
        System.out.println(car1.equals(car4));
    }
}
