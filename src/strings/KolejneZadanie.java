package strings;

public class KolejneZadanie {

    public static void main(String[] args) {


        String wejsciowe = "Hello";
        int input = 3;
        int dlugosc = wejsciowe.length() - 1;

           if(input<dlugosc) {
               String result = (wejsciowe.substring(input) + wejsciowe.substring(0, input));
               System.out.println(result);


           }
           else {
               System.out.println(wejsciowe);
           }



    }
}
