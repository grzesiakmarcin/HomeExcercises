package arrays;

public class loops {

    public static void main(String[] args) {

        int[] tab1= {1,2,3,4,5,6,7,8,9,10};

        int[] tab2= {22,33,44,55,66,77,8,99,108,12,32,4,2,1,4};

        int[][] tab3= {{123,32},{333,44},{1,2,3,4,5},{44,65,34,78,99,66}};


        NextClass nC = new NextClass();

        //nC.evenPages(tab1);

        nC.firstEvenPages(tab1);
        nC.addTable(tab2);


        int [] tablica = new int []{69,1,2,3,4,5};

        for (int i =0; i<=tablica.length;i++){
            System.out.print(i+" ");
        }

        int zastepcza = tablica[tablica.length-1];


        System.out.println( " ")
        ;
        System.out.println("odliczanie po tablicy");
        for (int i =tablica.length-1; i>=0;i--){
            System.out.print(i+" ");
        }
        System.out.println("");

        System.out.println(" koniec odliczenia");

        // drukuj tablice3

        System.out.println("drukuj tablice");
        for (int i : tablica) {
            System.out.print(i+" ");
        }







    }
}

class NextClass{



    public void  evenPages(int[] tab){

        for (int i =0; i<tab.length ; i++){

            if(tab[i]%2==0){
                continue;

            }

            System.out.println(tab[i]+ " jest nieparzyste");
        }

        System.out.println("-==KONIEC==-" +"\n" );

    }

    public void  firstEvenPages(int[] tab){

        for (int i =0; i<tab.length ; i++){

            if(tab[i]%2==0){
                break;

            }

            System.out.println(tab[i]+ " jest pierwszą nieparzystą cyfrą w tablicy");
        }

        System.out.println("-==KONIEC==-" +"\n" );

    }

    public int addTable(int[] tab){
        int sum=0;

        for (int incik: tab) {
            sum =sum+incik;
//          sum += incik;            - inne ujęcie, ponoć bardziej powszechna forma zapisu;

            }

        System.out.println(sum);
        return sum;
    }

}