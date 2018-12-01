import org.junit.Before;
import org.junit.Test;

public class PaginatorTest {

    Paginator paginator;
    private final int LENGTH = 10;

    @Before
    public void setPaginator() {
        paginator = new Paginator(LENGTH, length);

    }

    @Test
    public void splitText() {
        String enter = "123456789012345678901234567890123456789012345";// dlugosc to 45
        paginator.paginate(enter).equals(5);
    }
}
