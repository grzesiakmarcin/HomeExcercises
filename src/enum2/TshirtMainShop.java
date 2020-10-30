package enum2;

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

        for (Object koszulka: poRozmiarze) {
            System.out.println((Tshirt) koszulka);

        }


        }

    }




