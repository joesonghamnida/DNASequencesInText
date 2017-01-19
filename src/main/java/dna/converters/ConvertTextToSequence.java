package dna.converters;

/**
 * Created by joe on 1/11/17.
 */
public class ConvertTextToSequence {

    public static String convertTextToSequence(String rawText) {

        Character[] nucleotides = {'a', 'g', 'c', 't'};
        rawText.toLowerCase();
        char[] rawCharArray = rawText.toCharArray();
        String convertedText = "";

        for (Character c : rawCharArray) {
            for (char nucleotide : nucleotides) {
                if (c.equals(nucleotide)) {
                    convertedText += c;
                }
            }
        }
        return convertedText.toUpperCase();
    }
}

