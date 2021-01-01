package projekty;

public class ArrayMaker {

    int[] tablica;

    int[] makeArrayFromString(int[] array, String string){

        tablica= new int[array.length];

        for (int i=0;i<array.length;i++){

            array[i]=Integer.parseInt(string.substring(i,i+1));

            tablica[i]=array[i];

        }



        for (int elemenent : tablica){
            System.out.println(elemenent);
        }
        System.out.println();


        return array;
    }


    void wypluj (){

    }

}
