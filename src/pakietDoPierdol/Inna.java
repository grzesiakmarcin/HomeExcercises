package pakietDoPierdol;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Inna {
    public static void main(String[] args) {
//
//czemu drukuje az 10 cyfr?

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            for (int j = 0; j < 5; j++) {
//                System.out.println(j);
//                break;
//            }
//        }
//
//    }
//
        Scanner sc = new Scanner(System.in);
        boolean result = true;
        int number = 1;
        double previousNumber = 13.1415;


        while (sc.hasNext()) {

            number = sc.nextInt();

            if (previousNumber == 13.1415) {
                previousNumber = number;
            }

            if (number == 0) {
                break;
            }

            if (number == (previousNumber) || number == (previousNumber + 1) || number == (previousNumber - 1)) {
                result = true;
                previousNumber=number;

            }
            else{
                result=false;
                break;

            }

        }


        System.out.println(result);



    }
}