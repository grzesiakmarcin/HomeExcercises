package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class Reader {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            File plik = new File("newFile.txt");


            if (!plik.exists()) {
                plik.createNewFile();
            }


            System.out.println("czy moge zapisac?: " + plik.canWrite());
            System.out.println("czy moge otworzyc?: " + plik.canExecute());
            System.out.println("ostatnio zmodyfikowany?: " + plik.lastModified());
            System.out.println("czy jest plikiem? na zasadzie czy to nie jest katalog: " + plik.isFile());
            System.out.println("ostatnio zmodyfikowany?: " + new Date(plik.lastModified()));
            System.out.println("ścieżka absolutna: " + plik.getAbsolutePath());
            System.out.println("ilość znaków w pliku: " + plik.length());




        } catch (IOException e) {
            e.printStackTrace();
        }


        // tworzenie katalogów

        File katalog = new File ("pierwszyKatalog"+File.separator+"drugiKatalog");
        katalog.mkdirs();

        try {
            File drugiPlik = new File("inny plik");
            if (!drugiPlik.exists()) {
                drugiPlik.createNewFile();
            }

            System.out.println("ściezka pliku: "+drugiPlik.getAbsolutePath());
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }

        System.out.println("\nwersja systemu: "+System.getProperty("os.version"));
        System.out.println("architektura systemu: "+System.getProperty("os.arch"));
        System.out.println("kompilator javy: "+System.getProperty("java.compiler"));
        System.out.println("separator systemowy: "+System.getProperty("file.separator"));
        System.out.println("nazwa użytkownika: "+System.getProperty("user.name"));
        System.out.println("java version: "+System.getProperty("java.runtime.version"));
        System.out.println("--------------------");

        Reader.wypiszSciezki(new File(System.getProperty("user.dir")));

    }

    public static void wypiszSciezki(File nazwaSciezki){
        String[] nazwyPlikówiKatalogów = nazwaSciezki.list();
        System.out.println(nazwaSciezki.getPath());

        for (int i=0; i< nazwyPlikówiKatalogów.length;i++){
            File p = new File(nazwaSciezki.getPath(),nazwyPlikówiKatalogów[i]);
            System.out.println(p.getPath());
        }
    }
}
