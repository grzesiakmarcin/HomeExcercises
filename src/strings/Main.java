package strings;

public class Main {

    public static void main(String[] args) {


        String number = "7,125,552,12";
        System.out.println( new Inna().ret(number));

    }



}
class Inna{
    public String ret (String s){
        return  s.replace(",","");

    }
}
