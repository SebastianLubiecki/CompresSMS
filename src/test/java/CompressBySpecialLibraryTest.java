import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CompressBySpecialLibraryTest {
    private CompresBySpecialLibrary compressObject;

    @Before
    public void setCompress() {
        compressObject = new CompresBySpecialLibrary();
    }

    @Test
    public void makeCompress() {

        String enterText = "asd asd asd werfdsf dfsddsfdsfdsfdsf dsf dsfdsf";
        String exitText = compressObject.compress(enterText);
        assertTrue(enterText.length() > exitText.length());
    }

    @Test
    public void makeDeCompress() {
        String exitText = "asd asd asd werfdsf dfsddsfdsfdsfdsf dsf dsfdsf";
        String enterText = compressObject.deCompress(exitText);
        assertTrue(enterText.length() < exitText.length());
    }


}
