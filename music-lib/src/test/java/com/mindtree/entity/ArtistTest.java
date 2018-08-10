package com.mindtree.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ArtistTest</code> contains tests for the class <code>{@link Artist}</code>.
 *
 * @generatedBy CodePro at 4/8/18 10:55 AM
 * @author Krithi
 * @version $Revision: 1.0 $
 */
public class ArtistTest {
	/**
	 * Run the Artist() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testArtist_1()
		throws Exception {

		Artist result = new Artist();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Artist [artistId=null, artistName=null]", result.toString());
		assertEquals(null, result.getArtistId());
		assertEquals(null, result.getArtistName());
	}

	/**
	 * Run the Artist(Long,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testArtist_2()
		throws Exception {
		Long artistId = new Long(1L);
		String artistName = "";

		Artist result = new Artist(artistId, artistName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Artist [artistId=1, artistName=]", result.toString());
		assertEquals(new Long(1L), result.getArtistId());
		assertEquals("", result.getArtistName());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Artist fixture = new Artist(new Long(1L), "");
		Object obj = new Artist(new Long(1L), "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Artist fixture = new Artist(new Long(1L), "");
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Artist fixture = new Artist(new Long(1L), "");
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Artist fixture = new Artist(new Long(1L), "");
		Object obj = new Artist(new Long(1L), "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		Artist fixture = new Artist(new Long(1L), "");
		Object obj = new Artist(new Long(1L), "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		Artist fixture = new Artist(new Long(1L), "");
		Object obj = new Artist(new Long(1L), "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		Artist fixture = new Artist(new Long(1L), (String) null);
		Object obj = new Artist(new Long(1L), (String) null);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Long getArtistId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testGetArtistId_1()
		throws Exception {
		Artist fixture = new Artist(new Long(1L), "");

		Long result = fixture.getArtistId();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the String getArtistName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testGetArtistName_1()
		throws Exception {
		Artist fixture = new Artist(new Long(1L), "");

		String result = fixture.getArtistName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Artist fixture = new Artist((Long) null, "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(961, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		Artist fixture = new Artist(new Long(1L), (String) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(992, result);
	}

	/**
	 * Run the void setArtistId(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testSetArtistId_1()
		throws Exception {
		Artist fixture = new Artist(new Long(1L), "");
		Long artistId = new Long(1L);

		fixture.setArtistId(artistId);

		// add additional test code here
	}

	/**
	 * Run the void setArtistName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testSetArtistName_1()
		throws Exception {
		Artist fixture = new Artist(new Long(1L), "");
		String artistName = "";

		fixture.setArtistName(artistName);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Artist fixture = new Artist(new Long(1L), "");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Artist [artistId=1, artistName=]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/18 10:55 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	
}