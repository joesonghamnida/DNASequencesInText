import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void doesConvertTextToSequenceWork() {
        Assert.assertTrue("AGCT".equals(ConvertTextToSequence.convertTextToSequence("agct")));
        Assert.assertFalse("AGT".equals(ConvertTextToSequence.convertTextToSequence("agct")));
        Assert.assertFalse("AAGT".equals(ConvertTextToSequence.convertTextToSequence("agct")));
        Assert.assertFalse("AGFT".equals(ConvertTextToSequence.convertTextToSequence("agct")));
    }

}
