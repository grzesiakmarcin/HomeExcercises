package enum2;

import javax.swing.*;
import java.util.List;

public class TshirtMainShop {
    public static void main(String[] args) {
        Shop sklep = new Shop();

        Tshirt CottonWorld = new Tshirt("ModelPolo", EnumTshirtSize.L);
        Tshirt nike = new Tshirt("Agg", EnumTshirtSize.S);
        Tshirt puma = new Tshirt("NewBalance", EnumTshirtSize.XL);
        Tshirt adidas = new Tshirt("Agg", EnumTshirtSize.L);

        sklep.dodajTshirt(CottonWorld);
        sklep.dodajTshirt(nike);
        sklep.dodajTshirt(puma);
        sklep.dodajTshirt(adidas);


        List<Tshirt> poRozmiarze = sklep.getTshirtsBySize(EnumTshirtSize.L);

        for (Tshirt koszulka : poRozmiarze) {
            System.out.println(koszulka);

        }

        System.out.println(EnumTshirtSize.S.name());


        System.out.println("-------------=======drukuj zawartosc enuma===============--------------");

        for (EnumTshirtSize cosik: EnumTshirtSize.values()) {
            System.out.println(cosik);

        }

        System.out.println("-------------======================--------------");
        System.out.println(EnumTshirtSize.S.name());

        //for (EnumTshirtSize cosik2: EnumTshirtSize.valueOf(EnumTshirtSize.L)
          //   ) {

        //}
        System.out.println("------===========miejsce w ktorym znajduje sie typ w liscie typow=========----------" );
        System.out.println(EnumTshirtSize.XL.ordinal());

        System.out.println("----------============= jedna z wartosci ==========-----------");
        System.out.println("wymiar w klatce piersiowej dla  "+EnumTshirtSize.S.name()+" "+EnumTshirtSize.S.chestLength);






    }


}




