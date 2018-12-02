import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CastCalculator {

    private final BigDecimal UNIT_PRICE;

    public CastCalculator( BigDecimal unit_price) {
        this.UNIT_PRICE = unit_price;
    }

    public BigDecimal costOfSMS(List list) {


        return BigDecimal.valueOf(list.size()).multiply(UNIT_PRICE);
    }


    public static void main(String[] args) {
        CastCalculator castCalculator = new CastCalculator(BigDecimal.valueOf(2));
        List list = new ArrayList();

        System.out.println(castCalculator.costOfSMS(list));
    }
}
