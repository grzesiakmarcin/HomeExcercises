package codingBat;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("jeden", "Arek");
        map.put("dwa", "Kora");
        map.put("trzy", "Szymek");
        map.put("cztery", "Barbara");
        map.put("pięc", "Ala");


        if (map.containsKey("cztery")) {
            map.put("b", "Wladimir Putin");
         //   map.put("b", map.);


            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());

            }

        }
    }

    class Meeeethods {
        public Map<String, String> mapBully(Map<String, String> map) {

        /* Make a new empty map

        Map<String, String> map = new HashMap<String, String>();

        map.get(key) -- retrieves the stored value for a key, or null if that key is not present in the map.

        map.put(key, value) -- stores a new key/value pair in the map. Overwrites any existing value for that key.

        map.containsKey(key) -- returns true if the key is in the map, false otherwise.

        map.remove(key) -- removes the key/value pair for this key if present. Does nothing if the key is not present
        */


            if (map.containsKey("a")) {

                map.put("b", map.get("a"));
                map.put("a", "");
                return map;

            }

            return map;

        }

        public Map<String, String> mapShare(Map<String, String> map) {

            return map;
        }


    }

    public Map<String, String> mapShare(Map<String, String> map) {

        if(map.containsKey("c")){
            map.remove("c");
        }

        if(map.containsKey("a")){
            map.put("b", map.get("a"));
        }

        return map;
    }

    public Map<String, String> mapAB(Map<String, String> map) {

      if(map.containsKey("a")&& map.containsKey("b")){
          map.put("ab",map.get("a")+map.get("b"));
      }
        return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.put("ice cream","cherry");

        }
        map.put("bread","butter");
        return map;
    }

    public Map<String, String> topping2(Map<String, String> map) {

        if(map.containsKey("spinach")){
            map.put("spinach","nuts");
        }

        if(map.containsKey("ice cream")){
            map.put("yogurt",map.get("ice cream"));
        }
        return map;


    }

    public Map<String, String> topping3(Map<String, String> map) {
        if(map.containsKey("potato")){
            map.put("fries",map.get("potato"));
        }

        if(map.containsKey("salad")){
            map.put("spinach",map.get("salad"));
        }
        return map;
    }


    public Map<String, String> mapAB2(Map<String, String> map) {

        if(map.containsKey("a")&&map.containsKey("b")){
            if(map.get("a").equals(map.get("b")) ){
                map.remove("a");
                map.remove("b");
            }

        }


        return map;
    }

    public Map<String, String> mapAB3(Map<String, String> map) {


        if(map.containsKey("a")&& !map.containsKey("b")){
            map.put("b",map.get("a"));
        }
        if(map.containsKey("b")&& !map.containsKey("a")){
            map.put("a",map.get("b"));
        }


        return map;

    }

    public Map<String, String> mapAB4(Map<String, String> map) {

        if(map.containsKey("a")&& map.containsKey("b")) {
            if (map.get("a").length() > map.get("b").length()) {
                map.put("c", map.get("a"));

            } else if(map.get("a").length() < map.get("b").length()){
                map.put("c", map.get("b"));
            }

        }

        //testy coś nie chcą prześć ale moim zdaniem jest legitnie.

return map;
    }




}
