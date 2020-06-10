package codingBat;

import java.util.HashMap;
import java.util.Map;


/*
https://codingbat.com/java/Map-2
 */
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

     public Map<String, Integer> wordLen(String[] strings) {
         HashMap <String, Integer> myMap = new HashMap<String, Integer>();

         for (String stringus: strings){
             myMap.put(stringus, stringus.length());
         }

         return myMap;
     }

     public Map<String, String> pairs(String[] strings) {
         HashMap<String, String> myMap = new HashMap <String, String>();

         for (String stringus: strings){
             myMap.put(stringus.substring(0,1),stringus.substring(stringus.length()-1,stringus.length()));

         }

         return myMap;
     }

     /*
     Map-2 > wordCount  -> wykminic z Mateuszem

     public Map<String, Integer> wordCount(String[] strings) {
  HashMap <String, Integer>myMap = new HashMap <String, Integer>();

  for (int i=0; i<wirdCount.length; i++)
  {
    if()
  }


  return myMap;
}

      */


 }