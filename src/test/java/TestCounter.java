/**
 * 
 */

import org.junit.*;
import org.junit.Assert;

/**
 * Test class for Counter class
 * 
 * @author [YourName]
 * @version [Current Date]
 *
 */
public class TestCounter {

	/**
	 * Test method for {@link t1.Counter#increment()}.
	 */
	public util.Counter counter = null;

	@Before
	public void setUp() {
		counter = new util.Counter();
	}

	@Test
	public void testIncrement() {
		// fail("Not yet implemented");
		counter.increment();
		Assert.assertEquals(1,counter._ctr);

	}

	/**
	 * Test method for {@link t1.Counter#decrement()}.
	 */
	@Test
	public void testDecrement() {
		counter.decrement();
		Assert.assertEquals(-1, counter._ctr);
	}

	/**
	 * Test method for {@link t1.Counter#reset()}.
	 */
	@Test
	public void testReset() {
		counter.reset();
		Assert.assertEquals(0, counter._ctr);
	}

	/**
	 * Test method for {@link t1.Counter#multiplyBy(int)}.
	 */
	@Test
	public void testMultiplyBy() {
		counter.increment();
		counter.multiplyBy(3);
		Assert.assertEquals(3, counter._ctr);
	}

}
