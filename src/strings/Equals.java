package strings;

public class Equals {

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {


        String a = "String A";
        String b = "String B";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


        System.out.println(a==b);


    }
}
