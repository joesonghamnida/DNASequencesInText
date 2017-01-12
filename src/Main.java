import java.io.FileNotFoundException;

/**
 * Created by joe on 1/11/17.
 */
public class Main {

    public static void main(String[] args)throws FileNotFoundException{
        String rawText = ReadFile.readFile("LoremIpsum.txt");
        String convertedText = ConvertTextToSequence.convertTextToSequence(rawText);

        SampleVirusSequences vz = new SampleVirusSequences();

        MatchVirusToTextLength.matchVirusToTextLength(convertedText, vz);

        CompareSequences.differenceBetweenSequences(convertedText, vz.getVarisellaZoster());
    }
}
