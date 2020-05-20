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



    public boolean squirrelPlay(int temp, boolean isSummer) {

        if (!isSummer) {

            return temp >= 60 && temp <= 90;

        } else

            return temp >= 60 && temp <= 100;

    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (!isBirthday){
            if (speed<=60){
                return 0;
            }
            else if (speed >80){
                return 2;

            }
            else  {
                return 1;
            }
        }


        else
        {
            if(speed<=65){
                return 0;
            }
            else if (speed >85){
                return 2;
            }
            else {
                return 1;
            }

        }


    }


    public int sortaSum(int a, int b) {
        if (a+b>=10&& a+b<=19)
            return 20;

        else
            return a+b;

    }


    public String alarmClock(int day, boolean vacation) {
        if(vacation){
            if(day ==6 || day ==0){
                return "off";
            }
            else {
                return "10:00";
            }

        }
        else{
            if (day ==6|| day==0){
                return "10:00";
            }

            else {
                return "7:00";
            }
        }

    }




}
