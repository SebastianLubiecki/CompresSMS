import java.math.BigDecimal;

public class CastCalculator {

    private final BigDecimal UNIT_PRICE;

    public CastCalculator( BigDecimal unit_price) {
        this.UNIT_PRICE = unit_price;
    }

    public BigDecimal costOfSMS(int numberOfSMS) {
        return BigDecimal.valueOf(numberOfSMS).multiply(UNIT_PRICE);
    }
}
