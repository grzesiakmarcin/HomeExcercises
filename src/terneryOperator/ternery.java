package terneryOperator;

public class ternery {
    public static void main(String[] args) {

        /*
        ?   zakancza warunek
        :   oddziela odpowiedzi
         */


        String napis = "Dużymi";


        String firsName = napis.equals("Dużymi") ? "Marcin" : "marcin";

        System.out.println(firsName);


        int a1=300;
        int b12 = 3332;
        int max= a1>b12  ?  a1 : b12;

        System.out.println(max);
/*
Ternary Operator as Null Check

You can use the Java ternary operator as a shorthand for null checks before calling a method on an object. Here is an example:

String value = object != null ? object.getValue() : null;

This is equivalent to, but shorter than this code:

String value = null;
if(object != null) {
    value = object.getValue();
}

As you can see, both of these code examples avoid calling object.getValue() if the object reference is null, but the first code example is a bit shorter and more elegant.
 */
        String value = firsName != null ? firsName : null;
        System.out.println(value);



        boolean b1= false;
        boolean b2= true;
        boolean b3= false;



        boolean result = (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3;

        System.out.println(result);


    }
}
