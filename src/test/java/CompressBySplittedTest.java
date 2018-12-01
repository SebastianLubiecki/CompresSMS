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
        String enterText = "asd asd asd";
        String exitText = "AsdAsdAsd";
        String compressText = compressObject.compress(enterText);
        assertEquals(exitText, compressText);

    }

    @Test
    public void makeDeCompress() {
        String enterText = "AsdAsdAsd";
        String exitText = "asd asd asd";
        String deCompressText = compressObject.deCompress(enterText);
        assertEquals(exitText, deCompressText);

    }
}
