import ie.atu.week9sem2.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator myCalc;

    @BeforeEach
    void setup() {
        myCalc = new Calculator();
    }

    @Test
    void testAddSuccess() {
        assertEquals(8, myCalc.add(4,4));
    }

    @Test
    void testAddFail() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {myCalc.add(Integer.MAX_VALUE, 4);});
        assertEquals("This value is too big", ex.getMessage());
    }

    @Test
    void testDivideSuccess() {
        assertEquals(8, myCalc.divide(64, 8));
    }

    @Test
    void testDivideFail() {
        Exception ex = assertThrows(ArithmeticException.class, () -> myCalc.divide(10, 0));
        assertEquals("Cannot Divide By 0", ex.getMessage());
    }

}
