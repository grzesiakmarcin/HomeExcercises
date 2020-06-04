package objects;

import java.util.Objects;

public class Car {

    String model;
    String typ;
    int rocznik;
    int moc;
    int VIN;

    public Car(String model, String typ, int rocznik, int moc, int VIN) {
        this.model = model;
        this.typ = typ;
        this.rocznik = rocznik;
        this.moc = moc;
        this.VIN = VIN;
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return  true;
        if (o== null|| this.getClass()!= o.getClass()) return false;

        Car przeslany = (Car) o;

        return this.model.equals(przeslany.model) &&
                this.typ.equals(przeslany.typ)&&
                this.moc==przeslany.moc &&
                this.rocznik==przeslany.rocznik &&
                this.VIN==przeslany.VIN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, typ, rocznik, moc, VIN);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", typ='" + typ + '\'' +
                ", rocznik=" + rocznik +
                ", moc=" + moc +
                '}';
    }
}
