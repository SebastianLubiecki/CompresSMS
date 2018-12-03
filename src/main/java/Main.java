import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void menu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type you SMS: \t");
        String smsMassage = scanner.nextLine();
        System.out.println("Chose type of compression" +
                "\nSimple: S" +
                "\nAdvance: A");
        String typeOfCompression = scanner.nextLine();

        if (typeOfCompression.equals("S")) {
            CompressBySplitted compressBySplitted = new CompressBySplitted();
            String textAfterCompression = compressBySplitted.compress(smsMassage);
            Paginator paginator = new Paginator(10);
            CastCalculator castCalculator = new CastCalculator(BigDecimal.valueOf(5));
            System.out.println("Cost of SMS is: " + castCalculator.costOfSMS(paginator.paginate(textAfterCompression)));
        }
        if (typeOfCompression.equals("A")) {
            CompressBySpecialLibrary compresBySpecialLibrary = new CompressBySpecialLibrary();
            String textAfterCompression = compresBySpecialLibrary.compress(smsMassage);
            Paginator paginator = new Paginator(10);
            CastCalculator castCalculator = new CastCalculator(BigDecimal.valueOf(5));
            System.out.println("Cost of SMS is: " + castCalculator.costOfSMS(paginator.paginate(textAfterCompression)));        }
    }

}
