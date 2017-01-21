package dna.statistics;

import dna.result.Result;
import dna.virus.Virus;

import java.util.ArrayList;

/**
 * Created by joe on 1/20/17.
 */
public class SequenceSimilarities {

    public static ArrayList<Result> calculateSimilarities(String docName, String document, ArrayList<Virus> viruses) {
        double similarity = 0.0;
        double discrepancies = 0.0;
        ArrayList<Result> results = new ArrayList<>();

        for(Virus virus : viruses){
            for(int i = 0; i < virus.getSequence().length();i++){
                if(document.charAt(i) != virus.getSequence().charAt(i)){
                    discrepancies++;
                }
                similarity = discrepancies / document.length();
                Result result = new Result(docName, virus.getName(), String.valueOf(similarity));
                results.add(result);
            }
        }

        return results;
    }

}
