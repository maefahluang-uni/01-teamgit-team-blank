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
public class TestFeature2 {

	/**
	 * Test method for {@link util.Counter#increment()}.
	 */
	public util.Counter counter = null;

	@Before
	public void setUp() {
		counter = new util.Counter();
	}

	@Test
	public void testIncrementToPrime(){
		counter._ctr = 7;
		counter.incrementToPrime();
		Assert.assertEquals(11, counter._ctr);
	}
	
	@Test
	public void testDecrementToPrime(){
		counter._ctr = 37;
		counter.decrementToPrime();
		Assert.assertEquals(31, counter._ctr);
	}
	

}
