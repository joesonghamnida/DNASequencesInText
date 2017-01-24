import dna.tools.ReadVirusFromFile;
import dna.tools.ReturnDocument;
import dna.virus.Virus;
import org.junit.Assert;
import org.junit.Test;

import dna.converters.*;
import dna.tools.MatchSequenceSize;

import java.io.FileNotFoundException;
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
        Virus virus = new Virus("test", "AAAGTGC");
        ArrayList<Virus> viruses = new ArrayList<>();
        viruses.add(virus);
        MatchSequenceSize.checkTextSequenceShorter(convertedString, viruses);
        System.out.println(virus.getSequence());
        Assert.assertTrue(convertedString.length() == virus.getSequence().length());
    }

    @Test
    public void matchSequenceSizeConvertedStringLonger(){
        String convertedString = "AAACGATTGCG";
        Virus virus = new Virus("test", "AAAC");
        ArrayList<Virus> viruses = new ArrayList<>();
        viruses.add(virus);
        MatchSequenceSize.checkTextSequenceLonger(convertedString, viruses);
        Assert.assertTrue(convertedString.length() == virus.getSequence().length());
        //System.out.println(virus.getSequence());
    }

    @Test
    public void readingVirusesFromFile()throws FileNotFoundException{
        ArrayList<Virus> viruses = new ArrayList<>();
        viruses = ReadVirusFromFile.readVirusFromFile();
        Assert.assertTrue(viruses.size() == 5);
    }

    @Test
    public void returningSelectedDocument()throws FileNotFoundException{
        String document = "";
        document = ReturnDocument.returnDocument("ArtificialLight.rtf");
        Assert.assertTrue(!document.isEmpty());
        document = ReturnDocument.returnDocument("IBM.rtf");
        Assert.assertTrue(!document.isEmpty());
        document = ReturnDocument.returnDocument("LoremIpsum.txt");
        Assert.assertTrue(!document.isEmpty());
    }
}
