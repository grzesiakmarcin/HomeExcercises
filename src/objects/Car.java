package objects;

import java.util.Objects;

public class Car {

    String model;
    String color;
    int year;












    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
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
