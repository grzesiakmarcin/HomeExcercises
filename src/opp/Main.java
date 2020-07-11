package opp;



public class Main {
    public static void main(String[] args) {


        SubMojaKlasa podklasa = new SubMojaKlasa();
        podklasa.odpalSilnik();
        System.out.println(podklasa.getSiedzibaWarsztatu());

        Tree dab = new Dab("dąb Bartek","liście",1000);
        Tree jabłoń = new Jablon("jabłoń z sadu","liście",70);
        Tree sosna = new Sosna("po prostu sosna","igly",170);
        Tree cytryna = new Cytryna("jakas tam cytryna","liście",30);



        Tree[] tablicaDrzew = new Tree[4];
        tablicaDrzew[0]= dab;
        tablicaDrzew[0]= jabłoń;
        tablicaDrzew[0]= sosna;
        tablicaDrzew[0]= cytryna;



    }
}
