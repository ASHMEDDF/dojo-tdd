import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTests {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

}
