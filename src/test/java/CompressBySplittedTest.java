import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.omg.CORBA.Object;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class CompressBySplittedTest {
    private CompressBySplitted compressObject;

    @Before
    public void setCompress() {
        compressObject = new CompressBySplitted();
    }

    @Test
    public void makeCompress() {
        String enterText = "asd asd asd";
        String exitText = "AsdAsdAsd";
        String compressText = compressObject.compress(enterText);
        assertEquals(exitText, compressText);
    }

    @Test
    public void makeDeCompress() {
        String enterText = "AsdAsdAsd";
        String exitText = "asd asd asd";
        String deCompressText = compressObject.deCompress(enterText);
        assertEquals(exitText, deCompressText);
    }

//
//    @Test
//    @Parameters(method = "calcValues")
//    public void simpleCalcTest(BigDecimal unitCost, int numberOfMessages, BigDecimal expectedValue) {
//        CastCalculator calc = new CastCalculator(unitCost);
//        assertEquals(new BigDecimal(8), calc.costOfSMS(2));
//    }
//
//    private Object[] calcValue() {
//        return new Object[]{
//                new Object[]{new BigDecimal(0), 100, new BigDecimal(0)},
//
//                new Object[]{new BigDecimal(0.3), 10, new BigDecimal(3)},
//
//                new Object[]{new BigDecimal(0.3), 0, new BigDecimal(0)},
//
//        };
//    }
}
