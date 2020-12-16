package statics;

import java.util.Date;

public class StaticsInitBlockExample {


    //    private static String stringField;
//    private static Date dateField;
//
//    private static final String A_STRING_CONSTANT;
//
//    static {
//        stringField = getEmptyString();
//        dateField = new Date();
//        A_STRING_CONSTANT = "unknown";
//    }
//
//    private static String getEmptyString() {
//        return "empty";
//    }
   private int[] array;

    {
        System.out.println("Before the constructor");

        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
    }

    public void print() {
        for (int num : array) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }


}

class jakasTamKlasa{
    public static void main(String[] args) {
        StaticsInitBlockExample obj = new StaticsInitBlockExample();

        obj.print();

        Student jakisStudent = new Student();


        jakisStudent.przedstawSie();
    }
}
