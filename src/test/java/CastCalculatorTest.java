import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

public class CastCalculatorTest {

    private CastCalculator calculator;
    BigDecimal UNIT_PRICE = BigDecimal.valueOf(0.3);

    @Before
    public void setCalculator() {
        calculator = new CastCalculator(UNIT_PRICE, unit_price);
    }

    @Test
    public void costOfSms() {
        int numberOfSMS = 10;
        assertTrue(calculator.costOfSMS(numberOfSMS).equals(3));
    }

    @Test
    public void costOfNullSms() {
        int numberOfSMS = 0;
        assertTrue(calculator.costOfSMS(numberOfSMS).equals(0));
    }


}
