package objects;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.Class;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {


        Car car1 = new Car("BMW 3","kombi",2005,115,131321);
        Car car2 = new Car("Kia Ceed","shitbox",2015,95,5654654);
        Car car3 = new Car("BMW 5","sedan",1999,171,654654665);
        Car car4 = new Car("BMW 3","kombi",2005,115,12132132);
        Car car5 = new Car("Skoda Octavia","kombi",2020,110,21321);

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
        System.out.println(car1.equals(car4));


        Class student =Class.forName("\"java.lang.String\"");

        Constructor[] declaredConstructors = student.getDeclaredConstructors();
        Constructor[] constructors = student.getConstructors();
        Field[] declaredFields = student.getDeclaredFields();
        Field[] fields = student.getFields();
        Method[] declaredMethods = student.getDeclaredMethods();
        Method[] methods = student.getMethods();


        for(Constructor dc : declaredConstructors) {
            System.out.println("Declared Constructor " + dc.getName());
        }
        for (Constructor c : constructors) {
            System.out.println("Constructor " + c.getName());
        }
        for (Field df : declaredFields) {
            System.out.println("Declared Field " + df.getName());
        }
        for (Field f : fields) {
            System.out.println("Field " + f.getName());
        }
        for (Method dm : declaredMethods) {
            System.out.println("Declared Method " + dm.getName());
        }
        for (Method m : methods) {
            System.out.println("Method " + m.getName());
        }


    }
}
