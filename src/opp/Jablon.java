package opp;

public class Jablon extends Tree {
    public Jablon(String aNazwa, String aCoNaGaleziach, int aIleLat) {
        super(aNazwa, aCoNaGaleziach, aIleLat);
    }

    @Override
    public void rosnij() {
        System.out.println("Rosnę szybko, ale mam kruche gałęzie");
    }

    @Override
    public void fotosynteza() {
        super.fotosynteza();
        System.out.println(" nawet gdy owocuje. ");
    }

    @Override
    public void jakasMetoda() {
        System.out.println("na piachu nie urosnę.");
    }
}
