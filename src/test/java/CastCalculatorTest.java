import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class CastCalculatorTest {

    private CastCalculator calculator;
    BigDecimal unit_price = BigDecimal.valueOf(3); // zrobic parametryzacje i jedna metode i na cene ujemna

    @Before
    public void setCalculator() {
        calculator = new CastCalculator(unit_price);
    }

    @Test
    public void costOfSms() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        assertTrue(calculator.costOfSMS(list).equals(BigDecimal.valueOf(9)));
    }

    @Test
    public void costOfNullSms() {
        List list = new ArrayList();
        assertTrue(calculator.costOfSMS(list).equals(BigDecimal.valueOf(0)));
    }
}
