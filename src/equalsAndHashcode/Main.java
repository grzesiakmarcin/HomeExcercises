package equalsAndHashcode;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Andrzej",33);
        Person p2 = new Person("Andrzej",33);

        System.out.println("equals person");
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode()+" " + p2.hashCode());

        String s1 = new String("Andrzej");
        String s2 = new String("Andrzej");

       // System.out.println(s1.equals(s2)+" " +s1.hashCode()+" "+s2.hashCode());

        Animal a1 = new Animal("Klakier","brązowy",33);
        Animal a2 = new Animal("Klakier","brązowy",33);

        Animal a3 = new Animal();
        a3.setAge(33);
        a3.setColor("brązowy");
        a3.setName("Klakier");





        System.out.println(a1.equals(a2)+" "+ a1.hashCode()+" "+a2.hashCode());
        System.out.println(a1.equals(a3)+" "+ a1.hashCode()+" "+a3.hashCode());
        System.out.println(s1.equals(s2)+" "+ s2.hashCode()+" "+s2.hashCode());







    }
}
