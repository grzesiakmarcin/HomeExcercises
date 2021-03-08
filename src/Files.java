import java.io.File;
import java.io.IOException;


public class Files {
    public static void main(String[] args) throws IOException {


        File myFile = new File("filename.txt");
//
//        try {
//
//            if (myFile.createNewFile()) {
//                System.out.println("File created: " + myFile.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }


        try {
            boolean sa = myFile.createNewFile();
            System.out.println(sa);
            System.out.println(myFile.exists());
            System.out.println("Path: " + myFile.getPath());
            System.out.println("Name: " + myFile.getName());
            System.out.println("Scieżka absolutna: " + myFile.getAbsolutePath());
            System.out.println("Scieżka kanoniczna: " + myFile.getCanonicalPath());
        } catch (IOException e) {
            System.out.println("cos nie wyszło");
        }

        System.out.println("--------------------\n   Usuwamy   \n--------------------");
        try {
            boolean del = myFile.delete();
            System.out.println("czy usunięto: " + del);
        } catch (Exception e) {
            System.out.println("nie udało się usunąć");
        }

        System.out.println("czy istnieje " + myFile.exists());

        System.out.println("--------------------\n skonczylismy usuwac\n--------------------");

        File nowyPlik = new File("D:\\nowyFolder\\FolderI\\KolejnyFilder\\plik.txt");
        System.out.println(nowyPlik.mkdirs());
//        nowyPlik.delete();
//        System.out.println(nowyPlik.createNewFile());


    }
}
