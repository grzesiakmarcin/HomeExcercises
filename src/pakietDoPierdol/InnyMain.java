package pakietDoPierdol;

import sun.jvm.hotspot.opto.HaltNode;

import java.util.Scanner;

public class InnyMain {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz CALM albo NERVOUS");

        String wybor = sc.next();

        switch (UczzeSieEnumow.valueOf(wybor)) {

            case CALM :
                System.out.println("daj wiadomosc");
                String message=sc.next();
                System.out.println("uzytkownik wpisal CALM");

                UczzeSieEnumow.CALM.format(message);
                break;
            case NERVOUS:
                System.out.println("uzytkownik wybral nervous");
                break;


        }

        Human humanObject = new Human(12, KolorOczu.NIEBIESKIE, KolorWlosow.RUDE);

        System.out.println(humanObject);


    }
}
