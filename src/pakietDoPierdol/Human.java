package pakietDoPierdol;

//https://www.samouczekprogramisty.pl/typ-wyliczeniowy-w-jezyku-java/



public class Human {
    int wiek;
    KolorOczu kolorOczu;
    KolorWlosow kolorWlosow;

    public Human(int wiek, KolorOczu kolorOczu, KolorWlosow kolorWlosow) {
        this.wiek = wiek;
        this.kolorOczu = kolorOczu;
        this.kolorWlosow = kolorWlosow;
    }

    @Override
    public String toString() {
        return "Human{" +
                "wiek=" + wiek +
                ", kolorOczu=" + kolorOczu +
                ", kolorWlosow=" + kolorWlosow +
                '}';
    }
}


