package strings;

public class StringBuilder {

    public static void main(String[] args) {


        String name = "M54arcin grzesi45ds";

        System.out.println(name);

        String [] tablica = new ToArray().makeArrayFromString(name);


        for (int i = 0; i <= tablica.length - 1; i++) {
            System.out.println(tablica[i]);
        }

        java.lang.StringBuilder sbb = new java.lang.StringBuilder();

        for (int i = 0; i <= tablica.length - 1; i++){

            if(!tablica[i].equals("5")&&
               !tablica[i].equals("4")
                    ){
                sbb.append(tablica[i]);
            }

        }


        System.out.println("========================");
        System.out.println(sbb.toString());

    }
//
//
//        System.out.println(dlugosc);
//        System.out.println(sb.toString());
//        System.out.println(sb.charAt(3));
//        sb.replace(2,3,"A");

    // System.out.println(sb.toString());


}

class ToArray{

    public String[] makeArrayFromString(String input){
        String [] tablica = new String [input.length()];

        for (int i=0; i<input.length();i++){
            tablica[i]= String.valueOf(input.charAt(i));
        }


        return tablica;
    }
}
