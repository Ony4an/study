import Lesson_7.Operation;
import org.junit.Assert;
import org.junit.Test;


public class CalcTests extends Assert {

    @Test
            (expected = IllegalArgumentException.class)
    public void divisionByZeroException() {
        Operation operation = new Operation();
        operation.division(1, 0);
    }

    @Test
    public void additionWorkTest() {
        Operation operation = new Operation();
        operation.addition(4, 2);
        assertTrue(operation.getAnswer() == 6.0);
    }

    @Test
    public void substractionWorkTest() {
        Operation operation = new Operation();
        operation.subtraction(4, 2);
        assertTrue(operation.getAnswer() == 2.0);
    }

    @Test
    public void divisionWorkTest() {
        Operation operation = new Operation();
        operation.division(4, 2);
        assertTrue(operation.getAnswer() == 2.0);
    }

    @Test
    public void multiplicationWorkTest() {
        Operation operation = new Operation();
        operation.multiplication(4, 2);
        assertTrue(operation.getAnswer() == 8.0);
    }
}
