import java.util.LinkedList;
import java.util.List;

public class CompressBySplitted implements Compressor {


    @Override
    public String compress(String text) {

        String[] arrayOfUserText = text.split(" ");
        for (int i = 0; i < arrayOfUserText.length; i++) {
            arrayOfUserText[i] = arrayOfUserText[i].substring(0, 1).toUpperCase() + arrayOfUserText[i].substring(1);
            System.out.print(arrayOfUserText[i]);
        }
        return String.join("", arrayOfUserText);
    }

    @Override
    public String deCompress(String text) {
        String[] arrayFromDeCompress = text.split("(?=[A-Z])");
        StringBuilder newText = new StringBuilder();
        for (String arrayFromDeCompres : arrayFromDeCompress) {
            newText.append(arrayFromDeCompres).append(" ");
        }
        newText = new StringBuilder(newText.toString().toLowerCase());

        return String.valueOf(newText);
    }

    public static void main(String[] args) {
        CompressBySplitted compressBySplitted = new CompressBySplitted();
        System.out.println(compressBySplitted.deCompress("AbcDefGhi"));
    }
}
