import org.junit.Assert;
import org.junit.Test;

/**
 * Created by joe on 1/11/17.
 */
public class Tests {

    @Test
    public void doesConvertTextToSequenceWork(){
        Assert.assertTrue("AGCT".equals(ConvertTextToSequence.convertTextToSequence("agct")));
        Assert.assertFalse("AGT".equals(ConvertTextToSequence.convertTextToSequence("agct")));
        Assert.assertFalse("AAGT".equals(ConvertTextToSequence.convertTextToSequence("agct")));
        Assert.assertFalse("AGFT".equals(ConvertTextToSequence.convertTextToSequence("agct")));
    }

    @Test
    public void doesCalculateSimilaritiesWork(){
        double test = 1.0;
        Assert.assertTrue(1.0 == CompareSequences.calculateSimilarities(1,test));

        test = 2.0;
        Assert.assertTrue(.5 == CompareSequences.calculateSimilarities(1,test));
    }

    @Test
    public void doesTextHaveVirusWork(){
        String likely = "likely";
        String notLikely = "not likely";
        Assert.assertTrue(likely.equals(CompareSequences.doesTextHaveVirus(1.0)));
        Assert.assertTrue(notLikely.equals(CompareSequences.doesTextHaveVirus(.4)));
        Assert.assertFalse(likely.equals(CompareSequences.doesTextHaveVirus(.12)));
        Assert.assertFalse(notLikely.equals(CompareSequences.doesTextHaveVirus(.7)));
    }
}
