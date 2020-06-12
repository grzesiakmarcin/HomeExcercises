package maps;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        HashMap<Integer, String> myMap = new HashMap<Integer, String>();

        myMap.put(1, "Bacik");
        myMap.put(2, "Bielnik");
        myMap.put(3, "Duczmal");
        myMap.put(4, "Dylejko");
        myMap.put(5, "Grzesiak");


        System.out.println("-=Lecimy=-");

        // iterowanie po wartosciach

        for (String stringus : myMap.values()) {
            System.out.println(stringus);

        }
        System.out.println("\n");

        // iterowanie po kluczach wyhciagając wartosci

        for (Integer klucz: myMap.keySet()) {
            String wartosc = myMap.get(klucz);
            System.out.println(klucz+ " : " +wartosc);

        }


        System.out.println("\n");
        // iterowanie po kluczach i wartosciach

        for (Map.Entry<Integer, String> entry:myMap.entrySet()   ) {
            Integer klucz = entry.getKey();
            String wartosc = entry.getValue();

            System.out.println(klucz + " : " + wartosc);

        }


        System.out.println("\n -== FIN ==-");


        for (Map.Entry<Integer, String> enty : myMap.entrySet()) {         // iterowanie po kluczu i wartosci
            System.out.println(enty);
        }


        Map<Integer, String> mapa = new HashMap();

        Pracownik[] pracownicy = {
                new Pracownik("Agnieszka"),
                new Pracownik("Janek"),
                new Pracownik("Marta"),
                new Pracownik("Jacek"),
                new Pracownik("Henryk"),
                new Pracownik("Tyberiusz"),
                new Pracownik("Agnieszka"),
                new Pracownik("Janek"),
                new Pracownik("Marta"),
                new Pracownik("Jacek"),
                new Pracownik("Henryk"),
                new Pracownik("Tyberiusz"),
                new Pracownik("Agnieszka"),
                new Pracownik("Janek"),
                new Pracownik("Marta"),
                new Pracownik("Jacek"),
                new Pracownik("Henryk"),
                new Pracownik("Tyberiusz"),
                new Pracownik("Agnieszka"),
                new Pracownik("Janek"),
                new Pracownik("Marta"),
                new Pracownik("Jacek"),
                new Pracownik("Henryk"),
                new Pracownik("Tyberiusz"),
        };

        for (Pracownik ludzik : pracownicy){
            mapa.put(ludzik.getID(), ludzik.getImie());
        }


        System.out.println("\n"+ "Oto mapa pracowników: "+ "\n " +mapa);


    }
}

class Pracownik{

    public Pracownik(){
        i++;
        ID=i;
    }

    public Pracownik(String imie) {
        this();
        this.imie = imie;


    }

    private String imie;
    private int ID;
    public static int i=0;


    public String getImie() {
        return imie;
    }

    public int getID() {
        return ID;
    }
}
