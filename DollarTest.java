import org.junit.Test;
import static org.junit.Assert.*;

public class DollarTest {

	@Test
	public void testMultiplication() {
		Money five = new Money(5);
		five.times(2);
		assertEquals(10, five.amount);
	}
}
