package opp;

public class SubMojaKlasa extends MojaKlasa {

    @Override
    void odpalSilnik() {
        super.odpalSilnik();
        System.out.println("yyy yyyy yyyy keklekelkelkelaskedfslkjdfsh");

    }

    @Override
    public String getSiedzibaWarsztatu() {
        return super.getSiedzibaWarsztatu() + " kprzerobiony na mazowszu przez Pana Roberta.";

    }
}
