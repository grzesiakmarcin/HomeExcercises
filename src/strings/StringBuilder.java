package strings;

public class StringBuilder {

    public static void main(String[] args) {


        String name = "Marcin";
        String surname = "G.";
        String age = "34 years old";


        java.lang.StringBuilder sb = new java.lang.StringBuilder("Czesc \n");

        sb.append(name);
        sb.append(" ");
        sb.append(surname);

        System.out.println(sb);


    }

}
