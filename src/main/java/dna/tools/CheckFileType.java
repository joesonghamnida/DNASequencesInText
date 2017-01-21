package dna.tools;

import java.io.File;
import java.nio.file.Files;

/**
 * Created by joe on 1/20/17.
 */
public class CheckFileType {

    public static Boolean checkFileType(File document){
        Boolean fileTypePermitted = false;

        //https://www.ietf.org/rfc/rfc2045.txt

        //Files.probeContentType()
        //Files.isExecutable()

        //maybe break this into two functions, one to check for illegal file types (jpeg, pdf, etc)
        //and one to check for .exes?

        return fileTypePermitted;
    }
}
