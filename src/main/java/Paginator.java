import java.util.ArrayList;
import java.util.List;

public class Paginator {

    private final int LENGTH;

    public Paginator(int length) {
        this.LENGTH = length;
    }

    public List<String> paginate(String text) {

        List<String> listOfString = new ArrayList<>();

        while (text.length() > 0) {
            if (LENGTH < text.length()) {
                String substring = text.substring(0, LENGTH);
                listOfString.add(substring);
                text = text.substring(LENGTH);

            } else {
                String substring = text.substring(text.length());
                listOfString.add(substring);
                return listOfString;
            }
        }
        return listOfString;
    }
}
