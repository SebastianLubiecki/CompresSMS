import java.math.BigDecimal;

public class CastCalculator {

    private static double cost;

    public CastCalculator() {
        cost = 0.3;
    }

    public BigDecimal costOfSMS(int numberOfSMS) {
        return BigDecimal.valueOf(numberOfSMS * cost);
    }
}
