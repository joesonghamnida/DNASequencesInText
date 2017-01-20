package dna.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by joe on 1/19/17.
 */
public class ReturnDocument {

    public static String returnDocument(String document)throws FileNotFoundException{

        File f = new File(document);
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String foundDocument = s.next();
        s.close();

        return foundDocument;
    }
}
