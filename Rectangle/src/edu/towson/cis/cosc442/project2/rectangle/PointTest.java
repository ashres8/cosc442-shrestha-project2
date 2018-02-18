/**
 * 
 */
package edu.towson.cis.cosc442.project2.rectangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author asims
 *
 */
public class PointTest {
	Point point;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		point = new Point(2.0, 1.0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		point = null;
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.rectangle.Point#Point(java.lang.Double, java.lang.Double)}.
	 */
	@Test
	public void testPoint() {
		assertEquals(2.0, point.x, 0.001);
		assertEquals(1.0, point.y, 0.001);
	}

}
