package enums;



enum Direction {
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    private final String shortCode;

    Direction(String code) {
        this.shortCode = code;
    }

    public String getShortCode() {
        return this.shortCode;
    }

    public static Direction checkIfDirectionNORTH(Direction enums){
        for (Direction eeee: Direction.values()) {
            if(eeee==Direction.NORTH){
                System.out.println("Kierunek wieczna zima.");
            }

        }

        return null;

    }



}

class JakisObiekt{
    String name;
    int jakisNumer;
    Direction kierunek;

    public JakisObiekt(String name, int jakisNumer,Direction kierunek){
        this.name=name;
        this.jakisNumer=jakisNumer;
        this.kierunek=kierunek;
    }

    public Direction getKierunek(){
        return kierunek;
    }

    public int getJakisNumer(){
        return jakisNumer;
    }

    public String getName(){
        return name;
    }

    public void setJakisNumer(int jakisNumer){
        this.jakisNumer=jakisNumer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKierunek(Direction kierunek) {
        this.kierunek = kierunek;
    }

    @Override
    public String toString() {
        return "JakisObiekt{" +
                "name='" + name + '\'' +
                ", jakisNumer=" + jakisNumer +
                ", kierunek=" + kierunek +
                '}';
    }
}


class Jedziemy{
    public static void main(String[] args) {

        JakisObiekt rzeczonyObiekt = new JakisObiekt("Jestem Obiektem", 12, Direction.NORTH);

      switch(rzeczonyObiekt.getKierunek()){
          case NORTH:
              System.out.println("Nakurwiamy na północ");
              break;
          case SOUTH:
              System.out.println("Nakurwiamy na południe");
              break;
          case EAST:
              System.out.println("Nakurwiamy na wschód");
              break;
          case WEST:
              System.out.println("Nakurwiamy na zachód");
              break;

      }
        for (Direction cosik: Direction.values()) {
            System.out.println(cosik);

        }


   Direction.checkIfDirectionNORTH(rzeczonyObiekt.getKierunek());





    }

}


