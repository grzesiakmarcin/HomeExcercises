package exceptionCatching;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AnotherMain {

    public static void main(String[] args) {
        RuntimeException thisOne = new RuntimeException("To jest dzień w którym program się zatrzyma");

        if(LocalDate.now().equals(LocalDate.of(2021,03,23))) {
            throw thisOne;           // program wyłączy się warunkowo
        }
        System.out.println("Jeśteśmy pod pętlą");


        throw new RuntimeException("no i masz");


    }

}


class Nowa{

    public static void halas(){
        System.out.println("halas");
    }
}
