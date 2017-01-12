import java.util.ArrayList;

/**
 * Created by joe on 1/11/17.
 */
public class MatchVirusToTextLength {

    public static void matchVirusToTextLength(String convertedText, SampleVirusSequences virus){

        int textSize = convertedText.length();
        int virusSize = virus.getVarisellaZoster().length();
        char[] nucleotides = virus.getVarisellaZoster().toCharArray();
        ArrayList<Character> holding = new ArrayList<>();
        if(textSize != virusSize){
            for(int i = 0; i < textSize; i++){
                holding.add(nucleotides[i]);
            }
        }
        String conversion = "";
        for(Character c : holding){
            conversion += c;
        }

        virus.setVarisellaZoster(conversion);
    }
}
