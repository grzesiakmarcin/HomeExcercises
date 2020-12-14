package enum2;

public enum ChargeLevel {


    FULL(4, "GREEN"),
    HIGH(3, "GREEN"),
    LOW(2, "YELLOW"),
    EMPTY(1, "RED");

    int sections;
    String colour;

    ChargeLevel(int sections, String colour) {
        this.sections = sections;
        this.colour = colour;
    }

    public int getSections(){
        return sections;
    }

    public String getColour(){

        return  colour;
    }

     public static ChargeLevel findByNumberOfSection(int sections){
         for (ChargeLevel value: values()) {
             if (value.sections == sections) {
                 return value;
             }
         }

        return null;
    }

//    public static  ChargeLevel findByObject (ChargeLevel enumis){
//        for (ChargeLevel cosik :enumis) {
//            if (enumis.colour== enumis.colour){
//                return enumis.colour;
//            }
//
//        }
//
//        return null;
//    }
}
