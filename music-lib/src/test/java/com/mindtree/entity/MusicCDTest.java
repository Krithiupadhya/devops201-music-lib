package com.mindtree.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>MusicCDTest</code> contains tests for the class <code>{@link MusicCD}</code>.
 *
 * @generatedBy CodePro at 4/8/18 10:57 AM
 * @author Krithi
 * @version $Revision: 1.0 $
 */
public class MusicCDTest {
	/**
	 * Run the MusicCD() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testMusicCD_1()
		throws Exception {

		MusicCD result = new MusicCD();

		// add additional test code here
		assertNotNull(result);
		assertEquals("MusicCD [cdId=null, title=null, yearOfRelease=null, musicTracks=null]", result.toString());
		assertEquals(null, result.getTitle());
		assertEquals(null, result.getCdId());
		assertEquals(null, result.getYearOfRelease());
		assertEquals(null, result.getMusicTracks());
	}

	/**
	 * Run the MusicCD(Long,String,Integer,List<MusicTrack>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testMusicCD_2()
		throws Exception {
		Long cdId = new Long(1L);
		String title = "";
		Integer yearOfRelease = new Integer(1);
		List<MusicTrack> musicTracks = new LinkedList<>();

		MusicCD result = new MusicCD(cdId, title, yearOfRelease, musicTracks);

		// add additional test code here
		assertNotNull(result);
		assertEquals("MusicCD [cdId=1, title=, yearOfRelease=1, musicTracks=[]]", result.toString());
		assertEquals("", result.getTitle());
		assertEquals(new Long(1L), result.getCdId());
		assertEquals(new Integer(1), result.getYearOfRelease());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());
		Object obj = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());
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
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());
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
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());
		Object obj = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());
		Object obj = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());
		Object obj = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());
		Object obj = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());
		Object obj = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testEquals_9()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", (Integer) null, new LinkedList<>());
		Object obj = new MusicCD(new Long(1L), "", (Integer) null, new LinkedList<>());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Long getCdId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testGetCdId_1()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());

		Long result = fixture.getCdId();

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
	 * Run the List<MusicTrack> getMusicTracks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testGetMusicTracks_1()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());

		List<MusicTrack> result = fixture.getMusicTracks();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getTitle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testGetTitle_1()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());

		String result = fixture.getTitle();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Integer getYearOfRelease() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testGetYearOfRelease_1()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());

		Integer result = fixture.getYearOfRelease();

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
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		MusicCD fixture = new MusicCD((Long) null, "", new Integer(1), (List<MusicTrack>) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(923522, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), (String) null, (Integer) null, new LinkedList<>());

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(954273, result);
	}

	/**
	 * Run the void setCdId(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testSetCdId_1()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());
		Long cdId = new Long(1L);

		fixture.setCdId(cdId);

		// add additional test code here
	}

	/**
	 * Run the void setMusicTracks(List<MusicTrack>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testSetMusicTracks_1()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());
		List<MusicTrack> musicTracks = new LinkedList<>();

		fixture.setMusicTracks(musicTracks);

		// add additional test code here
	}

	/**
	 * Run the void setTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testSetTitle_1()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());
		String title = "";

		fixture.setTitle(title);

		// add additional test code here
	}

	/**
	 * Run the void setYearOfRelease(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testSetYearOfRelease_1()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());
		Integer yearOfRelease = new Integer(1);

		fixture.setYearOfRelease(yearOfRelease);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		MusicCD fixture = new MusicCD(new Long(1L), "", new Integer(1), new LinkedList<>());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("MusicCD [cdId=1, title=, yearOfRelease=1, musicTracks=[]]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/18 10:57 AM
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
	 * @generatedBy CodePro at 4/8/18 10:57 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

}