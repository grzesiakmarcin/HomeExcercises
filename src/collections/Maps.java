package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        HashMap<Integer, String> myMap = new HashMap<Integer, String>();

        myMap.put(1,"Bacik");
        myMap.put(2,"Bielnik");
        myMap.put(3, "Duczmal");
        myMap.put(4, "Dylejko");
        myMap.put(5,"Grzesiak");


        for (String stringus: myMap.values()){
            System.out.println(stringus);

        }


        for (Map.Entry<Integer, String> enty : myMap.entrySet()){         // iterowanie po kluczu i wartosci
            System.out.println(enty);
        }

    }
}
