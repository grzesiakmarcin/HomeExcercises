package codingBat;

import java.util.HashMap;
import java.util.Map;

public class Maps2 {
    public static void main(String[] args) {



    }

}
 class Kodzik{

     public Map<String, Integer> word0(String[] strings) {

         HashMap<String, Integer> map = new HashMap<String, Integer>();

         for (String  pozcyjaTablicy : strings){
             map.put(pozcyjaTablicy,0);
         }

         return map;
     }

 }