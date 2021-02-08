package refleksje;

class Shape {}
class Shape2D extends Shape {}
class Kolo extends Shape2D {}
class Kwadrat extends Shape2D {}

class Main {
    public static void main(String[] args) {

        Shape2D rzeczoneKolo = new Kolo();

        boolean r1 = rzeczoneKolo instanceof Shape;
        boolean r2 = rzeczoneKolo instanceof Shape2D;
        boolean r3 = rzeczoneKolo instanceof Kolo;


        System.out.println(" instance of " + r1 + " " + r2 + " " + r3);


        boolean r4 = rzeczoneKolo.getClass().isInstance(Shape.class);
        boolean r5 = rzeczoneKolo.getClass().isInstance(Shape2D.class);
        boolean r6 = rzeczoneKolo.getClass().isInstance(Kolo.class);

        System.out.println(" getClass().isInstance " + r4 + " " + r5 + " " + r6);

      //  boolean r7 = rzeczoneKolo.getClass() == Shape.class;  //incomparable types:
        boolean r8 = rzeczoneKolo.getClass() == Shape2D.class;
        boolean r9 = rzeczoneKolo.getClass() == Kolo.class;


        System.out.println(" getClass()== ***.class " + r8 + " " + r9);
    }


}

