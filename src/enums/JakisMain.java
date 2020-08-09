package enums;

public class JakisMain {
    public static void main(String[] args) {
        Direction polnoc = Direction.NORTH;

        System.out.println(polnoc);
        polnoc=Direction.valueOf("NORTH");

        System.out.println("Direction.valueOf(\"N\") returns Direction.NORTH as an Direction object");
      //  System.out.println(Direction.valueOf("N").getClass());
        System.out.println("--==  ==--");

        System.out.println("Direction.valueOf(\"NORTH\") returns Direction.NORTH as an Direction object");
        System.out.println(Direction.valueOf("NORTH").getClass());


        System.out.println("Direction.NORTH.toString() returns \"N\" as a String");
        System.out.println(Direction.NORTH.toString().getClass());

        System.out.println("Direction.NORTH.getShortCode() returns \"N\" as a String");
        System.out.println(Direction.NORTH.getShortCode().getClass());

        System.out.println("Direction.NORTH.name() returns \"NORTH\" as a String");
        System.out.println(Direction.NORTH.name().getClass());

}
}
