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
            if (LENGTH < text.length()) {
                String substring = text.substring(0, LENGTH);
                listOfString.add(substring);
            }
            text = text.substring(LENGTH);
            if (LENGTH > text.length()) {
                String substring = text.substring(i);
                listOfString.add(substring);
            }
        } while (LENGTH < text.length());
        return listOfString;
    }

    public static void main(String[] args) {
        Paginator paginator = new Paginator(10);
        System.out.println(paginator.paginate("abcdefghijklmnoprstuwxyzq"));

    }
}
