/**
 * Created by joe on 1/11/17.
 */
public class CompareSequences {

    public static void differenceBetweenSequences(String text, String virus){

        int i = 0;
        int difference = 0;

        for(i = 0; i < text.length();i++){
            if(text.charAt(i) != virus.charAt(i)){
                difference++;
            }
        }

            double virusLength = (double) virus.length();

            double percentage = calculateSimilarities(difference,virusLength);
            String likelihood = doesTextHaveVirus(percentage);
            System.out.printf("It is %f percent %s likely that your text has a virus\n", percentage, likelihood);
        }
    

    public static double calculateSimilarities(int difference, double virusLength){
        double percentage = difference / virusLength;
        return percentage;
    }

    public static String doesTextHaveVirus(double percentage){

        String likelihood = "likely";

        if(percentage < .5){
            likelihood = "not likely";
        }
        return likelihood;
    }
}
