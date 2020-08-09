package pakietDoPierdol;

import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            newArray[(i + 1) % size] = array[i];
        }

        for (int elem : newArray) {
            System.out.print(elem + " ");
        }
    }
}
