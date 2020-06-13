package codingBat;

import java.util.*;


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


        String[] tablica = new String[] {"poniedziałek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "jutro poniedzialek", "sroda"};


        d.firstChar(tablica);



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


    public Map<String, String> firstChar(String[] strings) {

        Map <String, String > mojaMapa =new HashMap <String, String >();


        for(String element : strings){
            if(mojaMapa.containsKey(element.substring(0,1))){

                String Value = mojaMapa.get(element.substring(0,1));
                String newValue = Value.concat(element);

                mojaMapa.put(element.substring(0,1), newValue);


            }
            else{
                mojaMapa.put(element.substring(0,1), element);
            }
        }


        return mojaMapa;
    }


    public String wordAppend(String[] strings) {

        Map<String, Integer> mojaMapa = new HashMap<String, Integer>();
        String rezultat = "";


        for(String stringus : strings){
            if(!mojaMapa.containsKey(stringus)){
                mojaMapa.put(stringus,1);
            }
            else{
                mojaMapa.put(stringus,mojaMapa.get(stringus)+1);
            }

            for (Map.Entry<String, Integer> entry: mojaMapa.entrySet() ) {
                if(entry.getValue()%2 == 0){
                   rezultat = entry.getKey();
                }



            }

        }



        return rezultat ;

    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map <String, Integer> countMap = new LinkedHashMap<String,Integer>();
        Map <String, Boolean> myMap = new HashMap<String, Boolean>();

        for(String stringus : strings){
            if(!countMap.containsKey(strings)){
                countMap.put(stringus,1);
            }
            else{countMap.put(stringus,countMap.get(stringus)+1);
            }
        }
//
//        for (Map.Entry lecimy: countMap.entrySet() ){
//            String key = lecimy.getKey();
//
//            if()
//        }





        return myMap;

    }



}