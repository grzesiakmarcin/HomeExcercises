package opp;

public class Cytryna extends Tree {

    public Cytryna(String aNazwa, String aCoNaGaleziach, int aIleLat) {
        super(aNazwa, aCoNaGaleziach, aIleLat);
    }

    @Override
    public void rosnij() {
        System.out.println("Na starcie rosnę bardzo szybko ale nie urastam do dużych rozmiarów");
    }

    @Override
    public void fotosynteza() {
        super.fotosynteza();
        System.out.println("\n Na potrzeby tego zadania założymy sobie że w czasie owocowania proces fotosyntezy jest zredukowany do 48%");
    }

    @Override
    public void jakasMetoda() {
        System.out.println("Potrzebuję dobrej gleby.");
    }
}
