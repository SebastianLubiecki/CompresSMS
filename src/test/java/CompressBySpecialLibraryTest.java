import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class CompressBySpecialLibraryTest {
    private CompressBySpecialLibrary compressObject;

    @Before
    public void setCompress() {
        compressObject = new CompressBySpecialLibrary();
    }

    @Test
    public void makeCompress() throws IOException {

        String enterText = "asd asd asd werfdsf dfsddsfdsfdsfdsf dsf dsfdsf";
        String exitText = compressObject.compress(enterText);
        assertTrue(enterText.length() > exitText.length());
    }

    @Test
    public void makeDeCompress() throws IOException {
        String exitText = compressObject.compress("asdasdas dwer fdsfdfsd dsfds fdsfdf");
        String enterText = compressObject.deCompress(exitText);
        assertTrue(enterText.length() < exitText.length());
    }


}
