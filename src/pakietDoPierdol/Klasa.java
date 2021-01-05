package pakietDoPierdol;

public class Klasa {

    public static void main(String[] args) {


        int[]tablica1 = {11,12,13,14};
        int[]tablica2 = {21,22,23,24};


        for(int i =0; i< tablica1.length;i++){

            System.out.println(tablica1[i]);

            for (int j=i+1; j< tablica2.length;j++){
                System.out.println(tablica2[j]);
            }
        }




    }
}
