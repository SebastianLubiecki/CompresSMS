import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

public class CastCalculatorTest {

    private CastCalculator calculator;
    BigDecimal UNIT_PRICE = BigDecimal.valueOf(0.3);

    @Before
    public void setCalculator() {
        calculator = new CastCalculator(UNIT_PRICE);
    }

    @Test
    public void costOfSms() {
        assertTrue(calculator.costOfSMS(10).equals(3));
    }
}
