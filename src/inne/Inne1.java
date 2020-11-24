package inne;

public class Inne1 {

    public static void main(String[] args) {
        char letter = 'A';


        while (letter!='['){
            System.out.print(letter);
            letter++;
        }
        System.out.println((byte)10);

        int a = 12;
        int b = 5;
        int c = 2;

        double d = 1.50511e+4;
        System.out.println((int)d);


        double posInf=Double.POSITIVE_INFINITY;
        System.out.println(posInf);
        double anotherPosInf = 1/0.0;
        System.out.println(anotherPosInf);
        System.out.println(1.0 / 0.0 == Double.POSITIVE_INFINITY);


        JakasTamKlasa obiekt1= new JakasTamKlasa("Kaja",12,"nowak" );
        System.out.println("przed zmianami");

        System.out.println(obiekt1.toString()+"\n");
        obiekt1.jakasTamMetoda(obiekt1);
        System.out.println("po zmianach"+"\n");
        System.out.println(obiekt1.toString());


    }

}

class JakasTamKlasa{
    String name;
    int liczba1;
    String secondName;

    public JakasTamKlasa(String name, int liczba1, String secondName) {
        this.name = name;
        this.liczba1 = liczba1;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLiczba1() {
        return liczba1;
    }

    public void setLiczba1(int liczba1) {
        this.liczba1 = liczba1;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "JakasTamKlasa{" +
                "name='" + name + '\'' +
                ", liczba1=" + liczba1 +
                ", secondName='" + secondName + '\'' +
                '}';
    }


    public JakasTamKlasa jakasTamMetoda (JakasTamKlasa obiekt){
        setName(obiekt.getName()+" godek");
        if (obiekt.getLiczba1()%2==0){
            obiekt.setLiczba1(obiekt.getLiczba1()+11);
        }
        obiekt.setSecondName("Tylko Opel");
        return obiekt;
    }


}
