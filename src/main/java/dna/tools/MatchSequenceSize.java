package dna.tools;

import dna.virus.Virus;

import java.util.ArrayList;

/**
 * Created by joe on 1/20/17.
 */
public class MatchSequenceSize {

    public static void matchSequenceSize(String convertedText, ArrayList<Virus> viruses) {
        checkTextSequenceShorter(convertedText, viruses);
        checkTextSequenceLonger(convertedText, viruses);
    }

    public static void checkTextSequenceShorter(String convertedText, ArrayList<Virus> viruses){
        for (Virus virus : viruses) {
            if (convertedText.length() < virus.getSequence().length()) {
                String subset = virus.getSequence().substring(0, convertedText.length() - 1);
                virus.setSequence(subset);
            }
        }
    }
    
    public static void checkTextSequenceLonger(String convertedText, ArrayList<Virus> viruses){
        for (Virus virus : viruses) {
            if (convertedText.length() > virus.getSequence().length()) {

                int i = 0;
                while (virus.getSequence().length() < convertedText.length()) {
                    String holding = "";
                    if (i == virus.getSequence().length() - 1) {
                        i = 0;
                    }
                    holding = holding + virus.getSequence().toString().charAt(i);
                    virus.setSequence(virus.getSequence() + holding);
                    i++;
                }
            }
        }
    }
}