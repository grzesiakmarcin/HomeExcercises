package poligon;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kwejk newKwejk= new Kwejk();

    }
}

class Kwejk implements Jakis{


    public int[] setTheArrayOfCoordinates(){

        Scanner sc = new Scanner(System.in);//"4 1");
        int[] integerArrayOfCoordinates = new int[2];

        try {
            String[] input = sc.nextLine().split(" ");

            integerArrayOfCoordinates[0] = Integer.parseInt(input[0]);
            integerArrayOfCoordinates[1] = Integer.parseInt(input[1]);
        }
        catch (Exception e){
            System.out.println("You should enter numbers!");
            return setTheArrayOfCoordinates();

        }
        System.out.println("pierwsza: "+integerArrayOfCoordinates[0]+" druga: "+integerArrayOfCoordinates[1]);



        if (integerArrayOfCoordinates[0] >=1 && integerArrayOfCoordinates[0] <=3 && integerArrayOfCoordinates[1] >=1 && integerArrayOfCoordinates[1] <=3){
            return integerArrayOfCoordinates;
        } else{
            System.out.println("Coordinates should be from 1 to 3!");
            return setTheArrayOfCoordinates();
        }



    }


        public int setTheCoordinate() {
        Scanner sc = new Scanner(System.in);
        int coordinate = 0;

        try {
            coordinate = sc.nextInt();
        } catch (Exception e) {
            System.out.println("You should enter numbers!");
            coordinate = setTheCoordinate();
        }
        if (coordinate < 1 || coordinate > 3) {
            System.out.println("Coordinates should be from 1 to 3!");
            coordinate = setTheCoordinate();
        }

        return coordinate;
    }

    @Override
    public void method() {

    }

    @Override
    public void abstractMethod() {

    }
}