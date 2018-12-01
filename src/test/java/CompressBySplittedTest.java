import org.junit.Before;
import org.junit.Test;

public class CompressBySplittedTest {
    private CompressBySplitted compressObject;

    @Before
    public void setCompress() {
        compressObject = new CompressBySplitted();
    }

    @Test
    public void makeCompress (){
        compressObject.compress("asd asd asd").equals("AsdAsdAsd");
    }

    @Test
    public void makeDeCompress (){
        compressObject.deCompress("AsdAsdAsd").equals("asd asd asd");
    }
}
