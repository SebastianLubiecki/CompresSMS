import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaginatorTest {  // tu tez parametryzacja

    Paginator paginator;
    private final int length = 160;

    @Before
    public void setPaginator() {
        paginator = new Paginator(length);
    }

    @Test
    public void splitText() {
        String[] exitArray = {""};
        String enter = "123456789012345678901234567890123456789012345";// dlugosc to 45
        paginator.paginate(enter).equals(exitArray.length);
    }

    @Test
    public void twoSMS() {
        String elementOnIndex0 = "12345678901234567890123456789012345678901234567890" +
                "12345678901234567890123456789012345678901234567890" +
                " 12345678901234567890123456789012345678901234567890" +
                "1234567890";
        String enter = "12345678901234567890123456789012345678901234567890" +
                "12345678901234567890123456789012345678901234567890" +
                "12345678901234567890123456789012345678901234567890" +
                "12345678901";// dlugosc to 161

        assertEquals(2, paginator.paginate(enter).size());
        assertEquals(elementOnIndex0, paginator.paginate(enter).indexOf(0));
    }

}
