package opp;

import java.util.Objects;

public class MojaKlasa {

   private String rodzajPaliwa = "diesel";
   private String nazwiskoInzyniera= "Otto Goring";
    private String siedzibaWarsztatu = "Berlin";



    void odpalSilnik(){
        System.out.println("klekleklekle");
    }

    public String getRodzajPaliwa() {
        return rodzajPaliwa;
    }

    public String getNazwiskoInzyniera() {
        return nazwiskoInzyniera;
    }

    public String getSiedzibaWarsztatu() {
        return siedzibaWarsztatu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MojaKlasa mojaKlasa = (MojaKlasa) o;
        return rodzajPaliwa.equals(mojaKlasa.rodzajPaliwa) &&
                nazwiskoInzyniera.equals(mojaKlasa.nazwiskoInzyniera) &&
                siedzibaWarsztatu.equals(mojaKlasa.siedzibaWarsztatu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rodzajPaliwa, nazwiskoInzyniera, siedzibaWarsztatu);
    }

    @Override
    public String toString() {
        return "MojaKlasa{" +
                "rodzajPaliwa='" + rodzajPaliwa + '\'' +
                ", nazwiskoInzyniera='" + nazwiskoInzyniera + '\'' +
                ", siedzibaWarsztatu='" + siedzibaWarsztatu + '\'' +
                '}';



    }
}
