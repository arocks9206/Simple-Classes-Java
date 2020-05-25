import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

        Calculator calculator;

        @Before
        public void before() {
            calculator = new Calculator(24, 4, 18, 9);
        }

        @Test
        public void canAdd() {
            assertEquals(28, calculator.add());
        }

        @Test
        public void canSubtract() {
            assertEquals(20, calculator.subtract());
        }

        @Test
        public void canMultiply() {
            assertEquals(96, calculator.multiply());
        }

        @Test
        public void canDivide() {
            assertEquals(2, calculator.divide(), 0.01);
        }

}
