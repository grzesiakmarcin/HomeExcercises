package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UdemyExercises {
    public static void main(String[] args) {

        Figura okrag = new Okrag();
        Figura kolo = new Kolo();


        List<Figura> listaFigur = new ArrayList<Figura>();

        listaFigur.add(okrag);
        listaFigur.add(kolo);

        Metody.wypisz(listaFigur);






    }
}

class Metody{

    public static void wypisz (List<? extends Figura> lista){

        for (Figura mojaLista : lista){
            System.out.println(mojaLista.pobierzNazwe());

        }
    }


    public static void przepiszTabliceDoKolekcji(Object[] tab, Collection<?> c){

        for (Object o:tab){
           // c.add(o);
        }

    }

}

class Figura{
    String nazwa =" ";

    public String pobierzNazwe(){
        return nazwa;
    }
}



class Kolo extends Figura
{
    public Kolo(){
        super.nazwa = "Kolo";
    }
}

class Okrag extends Figura{
    public Okrag(){
        super.nazwa="Okrąg";
    }
}


