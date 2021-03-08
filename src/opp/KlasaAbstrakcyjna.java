package opp;

abstract class KlasaAbstrakcyjna implements MojInterface {

   protected String nrseryjny;

    public KlasaAbstrakcyjna(String nrseryjny){
        this.nrseryjny=nrseryjny;
    }

    public String getNrseryjny() {
        return nrseryjny;
    }


}

class MojObiekt extends KlasaAbstrakcyjna{

    String imie;

    public MojObiekt(String nrseryjny ) {
        super(nrseryjny);

    }

    public MojObiekt(String nrseryjny, String imie) {
        super(nrseryjny);
        this.imie = imie;
    }


    @Override
    public void off() {
        System.out.println("no żegnam panstwa, bez zalu");

    }
}
