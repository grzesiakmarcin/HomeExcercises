package enums;

enum TshirtSize{

    S,M,L,XL,XXL;



}
enum Animals{
    CAT, DOG, MOUSE
}




public class InnyPrzyklad {
    public static void main(String[] args) {





    }


}

class App {
    public static void main(String[] args) {
        Animals anim =Animals.DOG;

        switch (anim){
            case DOG:
                System.out.println("piesek");
                break;
            case CAT:
                System.out.println("jebany kotek");
                break;

            case MOUSE:
                System.out.println("myszka");
                break;}

        System.out.println(Animals.DOG.getClass());
        System.out.println(Animals.DOG instanceof Animals);





    }
}
