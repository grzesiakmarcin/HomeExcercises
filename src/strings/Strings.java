package strings;

public class Strings {
    public static void main(String[] args) {


        String str = "Java";
        String out = "[[]]";

        Stringus s1 = new Stringus();
        s1.makeOutWord(out,str);

    }

}


class Stringus{



    public String makeOutWord(String out, String str) {
            System.out.println(out.substring(0,2) +str+out.substring(2,4));
            return  out;
    }

}
