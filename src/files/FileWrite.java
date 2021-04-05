package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) throws IOException {


        File fileOnWin = new File("D:\\Materials\\java-materials.txt"); // bad practice - user of the app may not have D: drive
        File fileOnUnix = new File("./Documents.txt");
     //   File myFile = new File("/textFiles/myText.txt");

      //  fileOnWin.createNewFile();
        fileOnUnix.createNewFile();



        System.out.println(  fileOnWin.exists());
        System.out.println(fileOnUnix.exists());

        File file = new File("/home/username/Documents/javamaterials.pdf");

        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Exists: " + file.exists());
        System.out.println("Parent path:" + file.getParent());


       // File myOtherFile = new File("/textFiles/myOtherTextFile.txt");
        //FileWriter writter = new FileWriter(myOtherFile);
//
//        writter.write("No Witam");
//        writter.write("Serio");
//
//        writter.close();
    }
}
