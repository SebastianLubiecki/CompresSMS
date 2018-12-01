import java.math.BigDecimal;

public class CastCalculator {

    private static BigDecimal UNIT_PRICE;

    public CastCalculator(BigDecimal UNIT_PRICE) {
        UNIT_PRICE = UNIT_PRICE;
    }

    public BigDecimal costOfSMS(int numberOfSMS) {
        return BigDecimal.valueOf(numberOfSMS).multiply(UNIT_PRICE);
    }
}
