package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FileWrite {

    public static void main(String[] args) throws IOException {


        File fileOnWin = new File("D:\\Materials\\java-materials.txt"); // bad practice - user of the app may not have D: drive
        File fileOnUnix = new File("./Documents.txt");
     //   File myFile = new File("/textFiles/myText.txt");

      //  fileOnWin.createNewFile();
        fileOnUnix.createNewFile();
        LocalDate localDate  = LocalDate.now();
        LocalTime localTime= LocalTime.now();
        String now = localDate+" "+localTime;





//
//        System.out.println(  fileOnWin.exists());
//        System.out.println(fileOnUnix.exists());

       // File file = new File("/home/username/Documents/javamaterials.pdf");


        // File myOtherFile = new File("/textFiles/myOtherTextFile.txt");
        //FileWriter writter = new FileWriter(myOtherFile);
//
//        writter.write("No Witam");
//        writter.write("Serio");
//
//        writter.close();


        File file = new File("file.txt");
        file.createNewFile();

        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Exists: " + file.exists());
        System.out.println("Parent path:" + file.getParent());

        FileWriter writer = new FileWriter(file,true); // overwrites the file

        writer.write("\n"+now);


        writer.close();


        try (PrintWriter printWriter = new PrintWriter(file,true)) {
            printWriter.print("Hello "); // prints a string
            printWriter.println("Java"); // prints a string and then terminates the line
            printWriter.println(123); // prints a number
            printWriter.printf("You have %d %s", 400, "gold coins"); // prints a formatted string
        } catch (IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }

    }
}
