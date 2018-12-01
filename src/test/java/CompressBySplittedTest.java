import org.junit.Before;
import org.junit.Test;

public class CompressBySplittedTest {
    private CompresBySplitted compressObject;

    @Before
    public void setCompress() {
        compressObject = new CompresBySplitted();
    }

    @Test
    public void makeCompress (){
        compressObject.compress();
    }

    @Test
    public void makeDeCompress (){
        compressObject.deCompress();
    }
}
