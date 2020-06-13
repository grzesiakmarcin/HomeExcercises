package maps;

import objects.Car;

import java.util.Map;
import java.util.TreeMap;

public class MapEntry {
    public static void main(String[] args) {

        Map<Integer, Car> mapaSamochodów = new TreeMap<Integer,Car>();

        mapaSamochodów.put(1, new Car("Bmm 3 ", "sedan",2008,198,1231564648));
        mapaSamochodów.put(2, new Car("VW Passat", "kombi",2005,110,121233648));
        mapaSamochodów.put(3, new Car("Toyota Corolla", "sedan",2001,95,26326648));
        mapaSamochodów.put(4, new Car("Ford Focus", "kombi",2008,110, 12651548));
        mapaSamochodów.put(5, new Car("Citroen Berlingo", "minivan",2001,100,778794648));
        mapaSamochodów.put(6, new Car("Opel Vivaro", "bus",2008,110,99987756));
        mapaSamochodów.put(7, new Car("Fiat PalioWeekend", "kombi",2008,78,987654655));


        for (Map.Entry<Integer,Car> rekord: mapaSamochodów.entrySet()) {
            Integer pozycja = rekord.getKey();
            String obiekt  = rekord.getValue().getModel();
            Integer rocznik = rekord.getValue().getRocznik();

            System.out.println("W garażu nr: " + pozycja + " znajduje się pojazd: "+obiekt+" rocznik: "+ rocznik);
        }


        System.out.println("\n dla porównania zwykla mapa \n");
        System.out.println(mapaSamochodów);

        System.out.println("\n i jeszcze troche inna ");

        for (Car  cosik: mapaSamochodów.values()) {
            System.out.println(cosik.getModel());

        }
        System.out.println("\n koniec");

    }
}
