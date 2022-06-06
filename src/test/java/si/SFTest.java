package si;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;
public class SFTest {
	@Category(SlowTests.class)
	@Test
	public void testSlowTest() {
		System.out.println("-----SlowTest is ran-----");
		assertTrue(true);
	}
	
	@Category(FastTests.class)
	@Test
	public void testFastTest() {
		System.out.println("-----FastTest is ran-----");
		assertTrue(true);
	}
}
