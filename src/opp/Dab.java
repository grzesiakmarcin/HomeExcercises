package opp;

public class Dab extends Tree {



    public Dab(String aNazwa, String aCoNaGaleziach, int aIleLat) {

        super(aNazwa, aCoNaGaleziach, aIleLat);
    }

    @Override
    public void rosnij() {
        System.out.println("Rosnę sobię dostojnie na neutralnej glebie, w kwaśnej nie będę rósł");
    }

    @Override
    public void fotosynteza() {
        super.fotosynteza();
    }

    @Override
    public void jakasMetoda() {
        super.jakasMetoda();
        System.out.println("\n Generalnie uważa się mnie za  super drzewo");
    }
}
