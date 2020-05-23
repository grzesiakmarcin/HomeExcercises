package codingBat;

public class WarmUp {
    public static void main(String[] args) {

    }
}


class Meethods {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday != true || vacation == true)
            return true;
        else
            return false;

    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile) {
            return true;
        }
        else {
            return false;

        }

    }

    public int sumDouble(int a, int b) {
        if(a!=b){
            return a+b;
        }
        else
        {return 2*(a+b);}
    }




}
