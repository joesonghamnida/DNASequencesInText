package dna.tools;

import dna.virus.Virus;

import java.util.ArrayList;

/**
 * Created by joe on 1/20/17.
 */
public class MatchSequenceSize {

    public static void matchSequenceSize(String convertedText, ArrayList<Virus> viruses){

        for(Virus virus : viruses){
            if(convertedText.length() < virus.getSequence().length()){
                String subset = virus.getSequence().substring(0, convertedText.length() - 1);
                virus.setSequence(subset);
            }
        }

        for(Virus virus : viruses){
            if(convertedText.length() > virus.getSequence().length()){
                String holding = "";
                for(int i = 0; i < (convertedText.length() - virus.getSequence().length());i++){
                    holding = holding + virus.getSequence().toString().charAt(i);
                }
                virus.setSequence(virus.getSequence() + holding);
            }
        }
    }
}
