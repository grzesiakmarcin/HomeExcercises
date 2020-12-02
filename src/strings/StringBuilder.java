package strings;

public class StringBuilder {

    public static void main(String[] args) {


        String name = "M54arcin grzesi45ds";

        java.lang.StringBuilder sb=new java.lang.StringBuilder(name);

        System.out.println(sb.toString());


        for (int i =0; i<=sb.length()-1;i++){
            if(sb.charAt(i)=='5'){
                System.out.println("znalazłem 5");
                sb.replace(i,i+1,"");
            }

        }
//
//
//        System.out.println(dlugosc);
//        System.out.println(sb.toString());
//        System.out.println(sb.charAt(3));
//        sb.replace(2,3,"A");

        System.out.println(sb.toString());


    }

}
