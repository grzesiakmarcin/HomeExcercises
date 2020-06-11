package codingBat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/*
https://codingbat.com/java/Map-2

 Make a new empty map

        Map<String, String> map = new HashMap<String, String>();

        map.get(key) -- retrieves the stored value for a key, or null if that key is not present in the map.

        map.put(key, value) -- stores a new key/value pair in the map. Overwrites any existing value for that key.

        map.containsKey(key) -- returns true if the key is in the map, false otherwise.

        map.remove(key) -- removes the key/value pair for this key if present. Does nothing if the key is not present

 */
public class Maps2 {
    public static void main(String[] args) {

        Kodzik d = new Kodzik();


        String[] tablica = new String[] {"poniedziałek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "jutro poniedzialek"};


        d.wordCount(tablica);



        // tablica wejściowa
        byte[] tablicaBajtów = new byte[] { 5, 5, 6, 6, 6, 7 };
        // mapa pomocnicza
        Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
        // zliczanie wystąpień dla każdej wartośći
        for (byte bajt : tablicaBajtów) {
            if (mapa.containsKey(Integer.valueOf(bajt))) {
                Integer wartość = mapa.get(Integer.valueOf(bajt));
                mapa.put(Integer.valueOf(bajt), wartość + 1);
            } else {
                mapa.put(Integer.valueOf(bajt), 1);
            }
        }

    }

}

class Kodzik {

    public Map<String, Integer> word0(String[] strings) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String pozcyjaTablicy : strings) {
            map.put(pozcyjaTablicy, 0);
        }

        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();

        for (String stringus : strings) {
            myMap.put(stringus, stringus.length());
        }

        return myMap;
    }

    public Map<String, String> pairs(String[] strings) {
        HashMap<String, String> myMap = new HashMap<String, String>();

        for (String stringus : strings) {
            myMap.put(stringus.substring(0, 1), stringus.substring(stringus.length() - 1));

        }

        return myMap;
    }

     /*
     Map-2 > wordCount  -> wykminic z Mateuszem
*/


    public Map<String, Integer> wordCount(String[] strings) {


        Map<String, Integer> mojaMapa = new HashMap<String, Integer>();

        for (String element : strings) {
            if (mojaMapa.containsKey(element)) {
                Integer iloscWystapienElementu = mojaMapa.get(element);
                mojaMapa.put(element, iloscWystapienElementu + 1);
            } else {
                mojaMapa.put(element, 1);
            }


        }
        return mojaMapa;
    }

//
//        Map<String, Integer> myMap = new HashMap<String, Integer>();
//
//        for(String stringus: strings) {
//            if (myMap.containsKey(stringus)){
//                Integer wartosc = myMap.get(Integer.valueOf(stringus));
//                myMap.put(stringus,wartosc+1);
//            }
//
//            else {
//                myMap.put(stringus,1);
//            }
//        }
//        return myMap;



}