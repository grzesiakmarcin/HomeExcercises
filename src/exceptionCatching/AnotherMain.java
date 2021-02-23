package exceptionCatching;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AnotherMain {

    public static void main(String[] args) {
        RuntimeException thisOne = new RuntimeException("To jest dzień w którym program się zatrzyma");

        if(LocalDate.now().equals(LocalDate.of(2021,02,23))) {
            throw thisOne;
        }
        System.out.println("hej");


    }

}
