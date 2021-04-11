package streams;

import files.Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("file.txt");

        char first = (char) reader.read();
        char second = (char) reader.read();

        char[] others = new char[12];

      for (int i =0; i< others.length;i++){
          others[i]= (char) reader.read();
      }
        System.out.println(first);
        System.out.println(second);
        for (Character element :others
             ) {
            System.out.println(element);
        }

        reader.close();
    }
}
