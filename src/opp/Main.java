package opp;

import apple.laf.JRSUIUtils;

public class Main {
    public static void main(String[] args) {


        SubMojaKlasa podklasa = new SubMojaKlasa();
        podklasa.odpalSilnik();
        System.out.println(podklasa.getSiedzibaWarsztatu());

        Tree dab = new Dab("dąb Bartek","liście",1000);
        Tree jabłoń = new Dab("dąb Bartek","liście",1000);
        Tree jodla = new Dab("dąb Bartek","liście",1000);
        Tree cytryna = new Dab("dąb Bartek","liście",1000);


    }
}
