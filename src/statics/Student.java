package statics;

public class Student {
    String name;
    String surname;
    int age;

    {
        name = "Jarosław";
        surname="Wołodyjewskji";
        age=12;
    }

    public Student() {
    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public void przedstawSie() {
        System.out.println(name+" "+surname+" "+age);
    }
}
