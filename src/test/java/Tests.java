import dna.virus.Virus;
import org.junit.Assert;
import org.junit.Test;

import dna.converters.*;
import dna.tools.MatchSequenceSize;

import java.util.ArrayList;

public class Tests {

    @Test
    public void doesConvertTextToSequenceWork() {
        Assert.assertTrue("AGCT".equals(ConvertTextToSequence.convertTextToSequence("agct")));
        Assert.assertFalse("AGT".equals(ConvertTextToSequence.convertTextToSequence("agct")));
        Assert.assertFalse("AAGT".equals(ConvertTextToSequence.convertTextToSequence("agct")));
        Assert.assertFalse("AGFT".equals(ConvertTextToSequence.convertTextToSequence("agct")));
    }

    @Test
    public void matchSequenceSizeConvertedStringShorter(){
        String convertedString = "AAA";
        Virus virus = new Virus("test", "AAAC");
        ArrayList<Virus> viruses = new ArrayList<>();
        viruses.add(virus);
        MatchSequenceSize.matchSequenceSize(convertedString, viruses);
        Assert.assertTrue(convertedString.length() == virus.getSequence().length());
    }

    @Test
    public void matchSequenceSizeConvertedStringLonger(){
        String convertedString = "AAACGATTGCG";
        Virus virus = new Virus("test", "AAAC");
        ArrayList<Virus> viruses = new ArrayList<>();
        viruses.add(virus);
        MatchSequenceSize.matchSequenceSize(convertedString, viruses);
        Assert.assertTrue(convertedString.length() == virus.getSequence().length());
        System.out.println(virus.getSequence());
    }
}
