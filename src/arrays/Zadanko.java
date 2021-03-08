package arrays;

import java.util.Scanner;

public class Zadanko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int howManyShops = sc.nextInt();

        String[][] array = new String[howManyShops][2];

        for (int i = 0; i < howManyShops; i++) {
            for (int j = 0; j <= 1; j++) {
                array[i][j] = String.valueOf(sc.next().split(" "));
            }
        }

        for (int i = 0; i <= howManyShops; i++) {
                System.out.println(array[i]);

        }

    }
}
