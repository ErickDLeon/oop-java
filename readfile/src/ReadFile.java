import java.io.File;
import java.util.Scanner;

public class ReadFile {

    public ReadFile() {

    }

    public void countWords() throws Exception {

        File f = new File("pg100.txt");
        Scanner s = new Scanner(f);
        int words = 0;

        while (s.hasNextLine()) {
            words += s.nextLine().split(" ").length;
        }

        s.close();

        System.out.println("words: " + words);
    }
}
