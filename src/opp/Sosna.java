package opp;

public class Sosna extends Tree {

    public Sosna(String aNazwa, String aCoNaGaleziach, int aIleLat) {
        super(aNazwa, aCoNaGaleziach, aIleLat);
    }

    @Override
    public void rosnij() {
        System.out.println("Rosnę szybko, bez względu na to czy w środku lasu czy też w ogródku");
    }

    @Override
    public void fotosynteza() {
        System.out.println("Fotosynteza?? Człowieku ja mam igły, więcej żywicy niż tleny");
    }

    @Override
    public void jakasMetoda() {
        System.out.println("jestem jak pasożyt - urosnę nawet na piachu.");
    }
}
