import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    public static String readFile(String text)throws FileNotFoundException{
        String rawText = "";

        File f = new File(text);

        Scanner fileScanner = new Scanner(f);
        while (fileScanner.hasNext()) {
            String line = fileScanner.next();
            line.split(" ");
            line.split(",");
            line.split(";");
            line.split(":");
            line.split(".");

            rawText += line;
        }

        return rawText;
    }
}

