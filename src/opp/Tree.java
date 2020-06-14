package opp;

public abstract class Tree {

    String nazwa = "Drzewo";
    String coNaGaleziach = "Lisc / Igły";
    int ileLat = 300;



    public Tree(String aNazwa, String aCoNaGaleziach, int aIleLat) {
        nazwa = aNazwa;
        coNaGaleziach = aCoNaGaleziach;
        ileLat = aIleLat;
    }

    public void rosnij(){
        System.out.println("Jakies akcje zwiazane ze wzrostem ");
    }

    public void fotosynteza (){
        System.out.println("Fotosynteza w standardowym tempie" );
    }

    public void jakasMetoda (){
        System.out.println("Metoda która coś tam robi.");
    }



}
