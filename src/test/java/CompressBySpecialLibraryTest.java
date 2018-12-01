import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompressBySpecialLibraryTest {
    private CompresBySpecialLibrary compressObject;

    @Before
    public void setCompress() {
        compressObject = new CompresBySpecialLibrary();
    }

    @Test
    public void makeCompress() {
       // compressObject.compress("asd asd asd").equals("AsdAsdAsd");
        assertEquals("AsdAsdAsd", compressObject.compress("asd asd asd"));
    }

    @Test
    public void makeDeCompress() {
        assertEquals("asd asd asd", compressObject.deCompress("AsdAsdAsd"));
        compressObject.deCompress("AsdAsdAsd").equals("asd asd asd");
    }


}
