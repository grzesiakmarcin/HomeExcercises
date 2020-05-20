package codingBat;


/*

Logic-1 chance

Basic boolean logic puzzles -- if else && || !. New videos: If Boolean Logic 1, If Boolean Logic 2
 */

public class Logic {
    public static void main(String[] args) {


        int a = 60;

        Methodss md = new Methodss();
        System.out.println(md.cigarParty(a,true));


    }
}

class Methodss{

    public boolean cigarParty(int cigars, boolean isWeekend) {

        if (isWeekend && cigars >= 40) {

            return true;

        } else if (!isWeekend) {

            return cigars >= 40 && cigars <= 60;

        }

        return false;

    }

    public int dateFashion(int you, int date) {
        if(you <=2 || date<=2){
            return 0;
        }
        else if
        (you>=8|| date>=8){
            return 2;
        }


        return 1;
    }




}
