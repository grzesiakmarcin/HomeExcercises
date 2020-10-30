package enum2;

public enum EnumTshirtSize {
    XS(70, 20, 70),
    S(75,25,75),
    M(77,27,77),
    L(80,30,80),
    XL(84,34,84),
    XXL(90,40,95);


    int chestLength;
    int sleeveLength;
    int totoalLength;

    EnumTshirtSize(int chestLength, int sleeveLength, int totoalLength) {
        this.chestLength = chestLength;
        this.sleeveLength = sleeveLength;
        this.totoalLength = totoalLength;

    }

    @Override
    public String toString() {
        return "EnumTshirtSize{" +
                "chestLength=" + chestLength +
                ", sleeveLength=" + sleeveLength +
                ", totoalLength=" + totoalLength +
                '}';
    }
}
