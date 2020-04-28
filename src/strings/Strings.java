package strings;

public class Strings {
    public static void main(String[] args) {


        String str = "Java";
        String out = "[[]]";

        StringOne s1 = new StringOne();

        s1.firstTwo(str);

    }

}


class StringOne{

    public String makeOutWord(String out, String str) {
            System.out.println(out.substring(0,2) +str+out.substring(2,4));

    return  out;
    }
        public String firstTwo(String str) {

            if (str.length()<3){
                return str;
            }

            else
            {
                return str.substring(0,2);
            }

        }

    public String firstHalf(String str) {
        int lenght= str.length()/2;

        return str.substring(0,lenght);
    }

    public String withoutEnd(String str) {
        return str.substring(0+1,str.length()-1);
    }

    public String comboString(String a, String b) {
        if(a.length()<b.length()){
            return a+b+a;
        }
        else{
            return b+a+b;
        }
    }
    public String left2(String str) {

        if(str.length()>2){
            return str.substring(2,str.length())+str.substring(0,2);
        }
        return str;

    }


}


