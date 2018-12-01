import org.junit.Before;
import org.junit.Test;

public class PaginatorTest {

    Paginator paginator;
    private final int length = 160;

    @Before
    public void setPaginator() {
        paginator = new Paginator(length);

    }

    @Test
    public void splitText() {
        String enter = "123456789012345678901234567890123456789012345";// dlugosc to 45
        paginator.paginate(enter).equals(1);
    }

    @Test
    public void twoSMS() {
        String enter = "12345678901234567890123456789012345678901234567890" +
                "12345678901234567890123456789012345678901234567890" +
                "12345678901234567890123456789012345678901234567890" +
                "12345678901";// dlugosc to 161
        paginator.paginate(enter).equals(2);
    }

}
