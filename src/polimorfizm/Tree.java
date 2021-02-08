package polimorfizm;
public class Tree  extends  Plant{
   private String nazwa;

    public Tree(String nazwa) {
        super(nazwa);
        System.out.println("Powstanie Drzewa "+ nazwa);
    }

    public void metodaTreeX (){
        System.out.println("Metoda X w tree");
    }
    public void metodaTreeY (){
        System.out.println("Metoda X w tree");
    }
    public void metodaTreeZ (){ System.out.println("metoda 3 w tree");}

    @Override
    public void metodaPlant2() {
        super.metodaPlant2();
        System.out.println("Dorzucam funkcyjnosc z klasy tree");
    }

}
