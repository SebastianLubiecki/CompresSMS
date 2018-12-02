import java.math.BigDecimal;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
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
            Paginator paginator = new Paginator(160);
            CastCalculator castCalculator = new CastCalculator(BigDecimal.valueOf(0.3));
            System.out.println("Cost of SMS is: " + castCalculator.costOfSMS(paginator.paginate(textAfterCompression)));
        }
        if (typeOfCompression.equals("A")) {
            CompresBySpecialLibrary compresBySpecialLibrary = new CompresBySpecialLibrary();
            compresBySpecialLibrary.compress(smsMassage);
        }
    }

}
