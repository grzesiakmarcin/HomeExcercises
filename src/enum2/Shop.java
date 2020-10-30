package enum2;

import java.util.LinkedList;
import java.util.List;

public class Shop {
    private List<Tshirt> listaTshirtow=new LinkedList<>();

//    public Shop(){
//        listaTshertow= new LinkedList<>();
//    }



    public void dodajTshirt (Tshirt tsh){
        listaTshirtow.add(tsh);

    }

    public void usunTshirt (Tshirt tsh){
        listaTshirtow.remove(tsh);
    }

    public List <Tshirt> getTshirtsBySize(EnumTshirtSize tsh) {
        List<Tshirt> TshirtBySize = new LinkedList<>();

        for (Tshirt koszlulka: listaTshirtow) {
            if (tsh==koszlulka.getSize()){
                TshirtBySize.add(koszlulka);
            }
            
        }
    return TshirtBySize;
    }

}
