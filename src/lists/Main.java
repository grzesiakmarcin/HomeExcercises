package lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

   ArrayList<String> listaStringow = new ArrayList<String>(50);
   listaStringow.add("Tomek");
   listaStringow.add("Kasia");
   listaStringow.add("Leszek");




    }
}

class Person {
    String name;
    String lastName;
    int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }




}
