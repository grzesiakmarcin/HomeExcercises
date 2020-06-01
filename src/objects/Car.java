package objects;

import java.util.Objects;

public class Car {

    String model;
    String color;
    int year;












    @Override
    public boolean equals(Object o) {
        if (this == o) return true;       // porównujemy x do x
        if (o == null || getClass() != o.getClass()) return false;  // sprawdzamy czy obiektt jest nullem, albo jest z innej klasy
        Car car = (Car) o;  // tutaj zrównujemy obiekt klasy Car z obiektem przeslanym do naszej metody
        return year == car.year &&   // a tutaj ostateczne porównanie  i dla typów prymitywnych == a dla typów obiektowych equals.
                model.equals(car.model) &&
                color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, year);
    }

    public Car (String model, String color, int year){
        this.color=color;
        this.model=model;
        this.year = year;
    }

}
