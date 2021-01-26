package localDate;


import java.math.BigInteger;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDateTime one = LocalDateTime.of(2018, 10, 20, 22, 30);
        LocalDateTime two = LocalDateTime.of(2017, 12, 30, 22, 31, 45);


        LocalDate dateOne = LocalDate.of(1987, 7, 9);
        LocalDate dateTwo = LocalDate.of(2017, 4, 4);

        System.out.println(dateOne.compareTo(dateTwo));  // -30 na zasadzie ze

        LocalTime timeOne = LocalTime.of(12, 02, 23);
        LocalTime timetwo = LocalTime.of(18, 22, 13);

        System.out.println(timeOne.compareTo(timetwo));

        System.out.println(timeOne.isBefore(timetwo));

        LocalTime time = LocalTime.of(22, 10);

        System.out.println(time.isAfter(LocalTime.of(22, 10, 10)));
        System.out.println(time.isBefore(LocalTime.of(22, 10)));
        System.out.println(time.isBefore(LocalTime.of(22, 10, 10)));


        LocalTime testOne = LocalTime.of(7, 30);

        LocalTime testTwo=LocalTime.of(7,50);

        System.out.println(testOne.compareTo(testTwo));
        int min = testOne.toSecondOfDay()/60;
        System.out.println(min);

        BigInteger liczba = new BigInteger("321231231231545364564");
        BigInteger innaLiczba = new BigInteger("5655687981");
        System.out.println(liczba.multiply(innaLiczba));
        innaLiczba = new BigInteger("342432");

        System.out.println(innaLiczba);


        long pseudoRandomNumber = System.nanoTime();

        System.out.println("PSEUDO RANDOM NUMBER");
        System.out.println( pseudoRandomNumber );

        String naszPass = String.valueOf(pseudoRandomNumber);

        int var1 = 659987;
        int var2 = 105048;
        System.out.println(var1 - var2);







    }
}
