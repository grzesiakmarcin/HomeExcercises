package opp;

import java.util.Date;

public class Person {  
    protected String name;
    protected int yearOfBirth;
    protected String address;

    public Person(String name, int yearOfBirth, String address) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }


    void metodka1(){
        int xx = 12;
        String napis = "znowu 12";


        System.out.println("\nCyfra na dziś to : " +xx+ "\n " +napis);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                '}';
    }


    // getters and setters
}

class Employee extends Person {

    protected Date startDate;
    protected Long salary;

    public Employee(String name, int yearOfBirth, String address,  Long salary) {
        super(name, yearOfBirth, address); // invoking a constructor of the superclass

        this.startDate = startDate;
        this.salary = salary;
    }

    // getters and setters

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                ", startDate=" + startDate +
                ", salary=" + salary +
                '}';
    }


    @Override
    void metodka1() {
        super(napis)

    }
}

class JakisMain{
    public static void main(String[] args) {
        Employee pracownik1 = new Employee("Stas",2020/1/02, "Leszno",5006L);

        System.out.println(pracownik1.toString());

        pracownik1.metodka1();


    }
}