package com.mindtree.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>MusicTrackTest</code> contains tests for the class <code>{@link MusicTrack}</code>.
 *
 * @generatedBy CodePro at 4/8/18 10:59 AM
 * @author Krithi
 * @version $Revision: 1.0 $
 */
public class MusicTrackTest {
	/**
	 * Run the MusicTrack() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testMusicTrack_1()
		throws Exception {

		MusicTrack result = new MusicTrack();

		// add additional test code here
		assertNotNull(result);
		assertEquals("MusicTrack [trackId=null, title=null, author=null, playingSec=null, artists=null]", result.toString());
		assertEquals(null, result.getTitle());
		assertEquals(null, result.getAuthor());
		assertEquals(null, result.getPlayingSec());
		assertEquals(null, result.getTrackId());
		assertEquals(null, result.getArtists());
	}

	/**
	 * Run the MusicTrack(Long,String,String,Long,List<Artist>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testMusicTrack_2()
		throws Exception {
		Long trackId = new Long(1L);
		String title = "";
		String author = "";
		Long playingSec = new Long(1L);
		List<Artist> artists = new LinkedList();

		MusicTrack result = new MusicTrack(trackId, title, author, playingSec, artists);

		// add additional test code here
		assertNotNull(result);
		assertEquals("MusicTrack [trackId=1, title=, author=, playingSec=1, artists=[]]", result.toString());
		assertEquals("", result.getTitle());
		assertEquals("", result.getAuthor());
		assertEquals(new Long(1L), result.getPlayingSec());
		assertEquals(new Long(1L), result.getTrackId());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());
		Object obj = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());
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
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());
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
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());
		Object obj = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());
		Object obj = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());
		Object obj = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());
		Object obj = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());
		Object obj = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testEquals_9()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());
		Object obj = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testEquals_10()
		throws Exception {
		MusicTrack fixture = new MusicTrack((Long) null, "", "", new Long(1L), new LinkedList());
		Object obj = new MusicTrack((Long) null, "", "", new Long(1L), new LinkedList());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the List<Artist> getArtists() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testGetArtists_1()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());

		List<Artist> result = fixture.getArtists();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getAuthor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testGetAuthor_1()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());

		String result = fixture.getAuthor();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Long getPlayingSec() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testGetPlayingSec_1()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());

		Long result = fixture.getPlayingSec();

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
	 * Run the String getTitle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testGetTitle_1()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());

		String result = fixture.getTitle();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Long getTrackId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testGetTrackId_1()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());

		Long result = fixture.getTrackId();

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
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", (String) null, new Long(1L), (List<Artist>) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(28630113, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		MusicTrack fixture = new MusicTrack((Long) null, (String) null, "", (Long) null, new LinkedList());

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(29552672, result);
	}

	/**
	 * Run the void setArtists(List<Artist>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testSetArtists_1()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());
		List<Artist> artists = new LinkedList();

		fixture.setArtists(artists);

		// add additional test code here
	}

	/**
	 * Run the void setAuthor(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testSetAuthor_1()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());
		String author = "";

		fixture.setAuthor(author);

		// add additional test code here
	}

	/**
	 * Run the void setPlayingSec(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testSetPlayingSec_1()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());
		Long playingSec = new Long(1L);

		fixture.setPlayingSec(playingSec);

		// add additional test code here
	}

	/**
	 * Run the void setTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testSetTitle_1()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());
		String title = "";

		fixture.setTitle(title);

		// add additional test code here
	}

	/**
	 * Run the void setTrackId(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testSetTrackId_1()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());
		Long trackId = new Long(1L);

		fixture.setTrackId(trackId);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		MusicTrack fixture = new MusicTrack(new Long(1L), "", "", new Long(1L), new LinkedList());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("MusicTrack [trackId=1, title=, author=, playingSec=1, artists=[]]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/18 10:59 AM
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
	 * @generatedBy CodePro at 4/8/18 10:59 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

}