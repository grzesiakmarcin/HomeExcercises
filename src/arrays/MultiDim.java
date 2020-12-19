package arrays;

public class MultiDim {
    public static void main(String[] args) {

        int[][] mojaTablica;

        mojaTablica = new int[][]{  {1, 2, 3, 4},
                                    {2, 33, 25,},
                                    {55},
                                    {21, 11, 33}};




        for (int i=0; i<= mojaTablica.length;i++){
            System.out.println(mojaTablica[i][mojaTablica[0][mojaTablica.length-1]]);
        }

    }
}
