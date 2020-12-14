package enums;

public class Klasa {
    public static void main(String[] args) {
        for (Planets planet : Planets.values()) {
            if (planet.mass() > 5.0e+24 && planet.radius() > 6.0e+7) {
                System.out.println(planet);
            }
        }


        UsersStatus active= UsersStatus.ACTIVE;

        System.out.println(active.name());
        System.out.println(active.ordinal());

        for ( UsersStatus jakis: UsersStatus.values()
             ) {
            System.out.println(jakis);

        }




    }
}
