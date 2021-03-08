package maps;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        String firstWord= "j";
        String secondWord= "J";
    secondWord= secondWord.toLowerCase();

        char [] firsArray = firstWord.toCharArray();
        char [] secArray = secondWord.toCharArray();
        Map<Character, Integer> myMap = new TreeMap<>();
        Map<Character, Integer> mySecondMap = new TreeMap<>();


        for (int i =0; i< firsArray.length;i++){
            if(!myMap.containsKey(firsArray[i])){
                myMap.put(firsArray[i],1);

            }

            else {
                myMap.replace(firsArray[i], myMap.get(firsArray[i]),myMap.get(firsArray[i])+1);

            }
        }

        for(int i=0; i<secArray.length;i++){
            if(!mySecondMap.containsKey(secArray[i])){
                mySecondMap.put(secArray[i],1);
            }
            else{
                mySecondMap.replace(secArray[i], mySecondMap.get(secArray[i]), mySecondMap.get(secArray[i])+1);
            }
        }



//
        System.out.println("=========Pierwsza mapa===========");
        for (Map.Entry<Character, Integer> pair :myMap.entrySet()
             ) {

            System.out.println("Klucz: "+pair.getKey()+" Wartość: "+pair.getValue());
        }

        System.out.println("=========Druga mapa===========");

        for (Map.Entry<Character, Integer> pair : mySecondMap.entrySet()) {

            System.out.println("Klucz: "+pair.getKey()+" Wartość: "+pair.getValue());
        }


        System.out.println("==================- ODPOWIEDZ -=======================");

        String result = myMap.equals(mySecondMap)?"yes":"no";
        System.out.println(result);








        //HashMap<Integer, String> myMap = new HashMap<Integer, String>();
//
//        myMap.put(1, "Bacik");
//        myMap.put(2, "Bielnik");
//        myMap.put(3, "Duczmal");
//        myMap.put(4, "Dylejko");
//        myMap.put(5, "Grzesiak");


//        System.out.println("-=Lecimy=-");
//
//        // iterowanie po wartosciach
//
//        for (String stringus : myMap.values()) {
//            System.out.println(stringus);
//
//        }
//        System.out.println("\n");
//
//        // iterowanie po kluczach wyhciagając wartosci
//
//        for (Integer klucz: myMap.keySet()) {
//            String wartosc = myMap.get(klucz);
//            System.out.println(klucz+ " : " +wartosc);
//
//        }
//
//
//        System.out.println("\n");
//        // iterowanie po kluczach i wartosciach
//
//        for (Map.Entry<Integer, String> entry:myMap.entrySet()   ) {
//            Integer klucz = entry.getKey();
//            String wartosc = entry.getValue();
//
//            System.out.println(klucz + " : " + wartosc);
//
//        }
//
//
//        System.out.println("\n -== FIN ==-");
//
//
//        for (Map.Entry<Integer, String> enty : myMap.entrySet()) {         // iterowanie po kluczu i wartosci
//            System.out.println(enty);
//        }
//
//
//        Map<Integer, String> mapa = new HashMap();
//
//        Pracownik[] pracownicy = {
//                new Pracownik("Agnieszka"),
//                new Pracownik("Janek"),
//                new Pracownik("Marta"),
//                new Pracownik("Jacek"),
//                new Pracownik("Henryk"),
//                new Pracownik("Tyberiusz"),
//                new Pracownik("Agnieszka"),
//                new Pracownik("Janek"),
//                new Pracownik("Marta"),
//                new Pracownik("Jacek"),
//                new Pracownik("Henryk"),
//                new Pracownik("Tyberiusz"),
//                new Pracownik("Agnieszka"),
//                new Pracownik("Janek"),
//                new Pracownik("Marta"),
//                new Pracownik("Jacek"),
//                new Pracownik("Henryk"),
//                new Pracownik("Tyberiusz"),
//                new Pracownik("Agnieszka"),
//                new Pracownik("Janek"),
//                new Pracownik("Marta"),
//                new Pracownik("Jacek"),
//                new Pracownik("Henryk"),
//                new Pracownik("Tyberiusz"),
//        };
//
//        for (Pracownik ludzik : pracownicy){
//            mapa.put(ludzik.getID(), ludzik.getImie());
//        }
//
//
//        System.out.println("\n"+ "Oto mapa pracowników: "+ "\n " +mapa);


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
