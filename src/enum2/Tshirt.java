package enum2;

import java.util.Objects;

public class Tshirt {
    private String modelName;
    private EnumTshirtSize size;

    public Tshirt (String modelName, EnumTshirtSize size){
        this.modelName=modelName;
        this.size = size;
    }

    public String getModelName() {
        return modelName;
    }

    public EnumTshirtSize getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tshirt tshirt = (Tshirt) o;
        return modelName.equals(tshirt.modelName) &&
                size == tshirt.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, size);
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "modelName='" + modelName + '\'' +
                ", size=" + size +
                '}';
    }
}
