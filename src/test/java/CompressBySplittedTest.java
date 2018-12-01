import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompressBySplittedTest {
    private CompressBySplitted compressObject;

    @Before
    public void setCompress() {
        compressObject = new CompressBySplitted();
    }

    @Test
    public void makeCompress() {
        assertEquals("AsdAsdAsd", compressObject.compress("asd asd asd"));
      //  compressObject.compress("asd asd asd").equals("AsdAsdAsd");
    }

    @Test
    public void makeDeCompress() {
        assertEquals("asd asd asd", compressObject.deCompress("AsdAsdAsd"));
      //  compressObject.deCompress("AsdAsdAsd").equals("asd asd asd");
    }
}
