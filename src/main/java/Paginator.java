import java.util.ArrayList;
import java.util.List;

public class Paginator {

    private final int LENGTH;

    public Paginator(int length) {
        this.LENGTH = length;
    }

    public List<String> paginate(String text) {

        List<String> listOfString = new ArrayList<>();

        int i = 0;
        do {
            String substring = text.substring(i, (i + LENGTH));
            listOfString.add(substring);
            i += LENGTH;
        }while (i<text.length());
        return listOfString;
    }

}
