package objects;

public class SomeClass {

    int val = 50;
    String str = "default";

    public SomeClass() {
        this(100);
    }

    public SomeClass(int val) {
        val = val;
    }

    public SomeClass(String str) {
        this();
        this.str = "some-value";
    }

    public SomeClass(int val, String str) {
        this(str);
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "val=" + val +
                ", str='" + str + '\'' +
                '}';
    }
}

class InnaKlasa{
    public static void main(String[] args) {
        SomeClass obiekt = new SomeClass(300,"Another Value");


        System.out.println(obiekt.toString());
    }


}