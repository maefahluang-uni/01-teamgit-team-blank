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
public class TestFeature3 {

	/**
	 * Test method for {@link util.Counter#increment()}.
	 */
	public util.Counter counter = null;

	@Before
	public void setUp() {
		counter = new util.Counter();
	}

	@Test
	public void testCountFrequency() {
		counter.countFrequency("hello", "This is hello from hello world program");
		Assert.assertEquals(2,counter._ctr);

	}
	

}
