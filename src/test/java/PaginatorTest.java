import org.junit.Before;
import org.junit.Test;

public class PaginatorTest {

    Paginator paginator;
    private  static  int LENGTH = 10;
    @Before
    public void setPaginator(){
        paginator = new Paginator(LENGTH);

    }

    @Test
    public void splitText (){
        paginator.paginate("wadsadxvzxvdfsdfsdfdsfdgvdsvcdscfdscvdsvdsv").equals(5);
    }
}
