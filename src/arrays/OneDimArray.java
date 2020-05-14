package arrays;

public class OneDimArray {
    public static void main(String[] args) {



        //deklaracja tablicy:
        //  String [] miesiaceRoku;
        // miesiceRoku[]=new String [12];



        String [] dniTygodnia= new String [7];

        dniTygodnia[0]="Poniedziałek";
        dniTygodnia[1]="Wtorek";
        dniTygodnia[2]="Sroda";
        dniTygodnia[3]="Czwartek";
        dniTygodnia[4]="Piatek";
        dniTygodnia[5]="sobota";
        dniTygodnia[6]="Niedziela";


        String[] zimaMiesiace = {"Grudzien", "Styczeń", "Luty"};


        //for

        for (int i=0; i<dniTygodnia.length;i++){
            System.out.println(dniTygodnia[i]);
        }

      // for each

        for (String stringus:dniTygodnia) {
            System.out.println(stringus);

        }


    }
}
