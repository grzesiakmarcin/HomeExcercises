package enums;

public class DniTygodniaTest {
 DniTygodnia day;

    public DniTygodniaTest(DniTygodnia day) {
        this.day = day;

    }

    public void jakJest(){
        switch (day){
            case MONDAY:
                System.out.println("chujowo jest");
                break;
            case FRIDAY:
                System.out.println("jest coraz lepiej" );
                break;
            default:
                System.out.println("czekamy na piątek");
                break;
        }
    }
}
class main {
    public static void main(String[] args) {
        System.out.println("no to zaczynamy ");


        DniTygodniaTest mojTest = new DniTygodniaTest(DniTygodnia.WEDNESDAY);
        mojTest.jakJest();
        System.out.println("------------------------");

        DniTygodniaTest mojKolejnyTest = new DniTygodniaTest((DniTygodnia.MONDAY));

        mojKolejnyTest.jakJest();

        System.out.println("teraz piateczek");
        DniTygodniaTest testujemyPiateczek = new DniTygodniaTest((DniTygodnia.FRIDAY));

        testujemyPiateczek.jakJest();


    }
}