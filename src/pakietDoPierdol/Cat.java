package pakietDoPierdol;

 class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    private void sayMeow(){
        System.out.println(this.name + " powiedz  meoooooaaaaawwwww");
    }

                     public  class Bow {
                          String colour;

                          public Bow(String colour) {
                              this.colour = colour;
                             }
                             public void printColour() {
                             System.out.println("Cat " + Cat.this.name + " has " +this.colour +" łuk." );
                              }

                              public void putOnABow(){
                             sayMeow();
                             System.out.println("założyłem na " + Cat.this.name +" ten "+ this.colour +" łuk");
                              }
                     }
}

 class JakisTamMain{
    public static void main(String[] args) {
        Cat kotek = new Cat ("Garefield");

        Cat.Bow  łuk= kotek.new Bow("zielonyh"); // ten zapis działa o ile klasa Bow nie jest statyczna.

       // Cat.Bow innyłuk = new Cat.Bow ("czarny"); // jeżeli klasa łuk będzie statyczna to ten zapis nie działa tak jak Cat.this.name

       łuk.printColour();

       Cat.Bow jeszczeInnyLuk  =kotek.new Bow ("czarny jak smoła");

       jeszczeInnyLuk.printColour();



       jeszczeInnyLuk.putOnABow();

       Cat bonifacy = new Cat ("Bonifacy");
       Cat.Bow lukBonifacego = bonifacy.new Bow("Biały jak amfa");

       lukBonifacego.putOnABow();
    }
}
