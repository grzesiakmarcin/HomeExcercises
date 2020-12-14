package enums;


enum Enum {
    APPLE,SAMSUNG,HTC
}


public class EnumExample {
    public static void main(String[] args) {


        //System.out.println(Direction.NORTH.toString());
//        System.out.println("Direction.NORTH.getShortCode() returns \"N\" as a String?");
//        Direction.NORTH.getShortCode();
//
//
//        System.out.println("Direction.valueOf(\"NORTH\") returns Direction.NORTH as a Direction object");
//        Direction.valueOf("NORTH");
//
//
//        System.out.println("Direction.NORTH.toString() returns \"N\" as a String");
//        Direction.NORTH.toString();
//
        System.out.println("Direction.valueOf(\"N\") returns Direction.NORTH as a Direction object");

        Direction.valueOf("N");

//        System.out.println("Direction.NORTH.name() returns \"NORTH\" as a String");
//
//        Direction.NORTH.name();



    }


}
