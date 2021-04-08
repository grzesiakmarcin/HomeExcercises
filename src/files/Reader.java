package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            File plik = new File("newFile.txt");


            if (!plik.exists()) {
                plik.createNewFile();
            }


            System.out.println("czy moge zapisac?: " + plik.canWrite());



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
