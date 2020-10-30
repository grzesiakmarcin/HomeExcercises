package enum2;

import java.util.LinkedList;
import java.util.List;

public class Shop {
    private List<Tshirt> listaTshertow;

    public Shop(){
        listaTshertow= new LinkedList<>();
    }


    public void dodajTshirt (Tshirt tsh){
        listaTshertow.add(tsh);

    }

    public void usunTshirt (Tshirt tsh){
        listaTshertow.remove(tsh);
    }

    public List <Tshirt> getTshirtsBySize(EnumTshirtSize tsh) {
        List<Tshirt> TshirtBySize = new LinkedList<>();

        for (Tshirt koszlulka: listaTshertow) {
            if (tsh==koszlulka.getSize()){
                TshirtBySize.add(koszlulka);
            }
            
        }
    return TshirtBySize;
    }

}
