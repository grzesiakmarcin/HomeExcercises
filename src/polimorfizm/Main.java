package polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Plant plant1 = new Plant("Roślina");
        Tree tree1 = new Tree("Dąb");
        Plant cos = new Tree("Sosna");


        List <Plant> mojaLista = new ArrayList<>();
        mojaLista.add(cos);
        mojaLista.add(tree1);

        boolean b1= Plant.class.isInstance(tree1);

        System.out.println(b1);
        


    }
}
