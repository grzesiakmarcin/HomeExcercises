package opp;

public abstract class Tree {

    private String nazwa = "Drzewo";
    private String coNaGaleziach = "Lisc / Igły";
    private int ileLat = 300;



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

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getCoNaGaleziach() {
        return coNaGaleziach;
    }

    public void setCoNaGaleziach(String coNaGaleziach) {
        this.coNaGaleziach = coNaGaleziach;
    }

    public int getIleLat() {
        return ileLat;
    }

    public void setIleLat(int ileLat) {
        this.ileLat = ileLat;
    }
}
