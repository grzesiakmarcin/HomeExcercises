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

    public int diff21(int n) {
        if(n>21){
            return 2*(n-21);
        }

        return 21-n;
    }

    public boolean parrotTrouble(boolean talking, int hour) {

        return (talking && (hour <7 || hour > 20));
    }

    public boolean makes10(int a, int b) {
        if(a==10|| b==10 || a+b==10){
            return true;
        }

        return false;
    }

    public boolean nearHundred(int n) {
        if (90 <= n && 110 >= n) {
            return true;
        } else if (190 <= n && 210 >= n) {
            return true;
        }
        return false;
    }

    public String endUp(String str) {

        if(str.length()>3){
          int cut = str.length()-3;  // slonia je się po kawałku

            return str.substring(0,cut)+str.substring(str.length()-3).toUpperCase();
        }
        return str.toUpperCase();
    }


    public boolean scoresIncreasing(int[] scores) {
        boolean indicator = false;
        for (int i=1; i>scores.length-1; i++){
            if(scores[i]>scores[i-1]){indicator = true;}
            indicator = false;

        }


        return indicator;
    }





}
