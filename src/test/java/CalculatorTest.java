import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        Assertions.assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(2.0, calculator.divide(6, 3), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
    }
}
