package com.mindtree.dto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mindtree.entity.Artist;

/**
 * The class <code>MusicCDSummaryTest</code> contains tests for the class <code>{@link MusicCDSummary}</code>.
 *
 * @generatedBy CodePro at 11/8/18 4:49 PM
 * @author Krithi
 * @version $Revision: 1.0 $
 */
public class MusicCDSummaryTest {
	/**
	 * Run the MusicCDSummary() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testMusicCDSummary_1()
		throws Exception {

		MusicCDSummary result = new MusicCDSummary();

		// add additional test code here
		assertNotNull(result);
		assertEquals("MusicCDSummary [cd_id=null, title=null, artists=null, yearOfRelease=null, noOfTracks=null, toPlayingTimeInsec=null]", result.toString());
		assertEquals(null, result.getTitle());
		assertEquals(null, result.getToPlayingTimeInsec());
		assertEquals(null, result.getCd_id());
		assertEquals(null, result.getYearOfRelease());
		assertEquals(null, result.getNoOfTracks());
		assertEquals(null, result.getArtists());
	}

	/**
	 * Run the MusicCDSummary(Long,String,Set<Artist>,Integer,Integer,Long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testMusicCDSummary_2()
		throws Exception {
		Long cd_id = new Long(1L);
		String title = "";
		Set<Artist> artists = new HashSet<>();
		Integer yearOfRelease = new Integer(1);
		Integer noOfTracks = new Integer(1);
		Long toPlayingTimeInsec = new Long(1L);

		MusicCDSummary result = new MusicCDSummary(cd_id, title, artists, yearOfRelease, noOfTracks, toPlayingTimeInsec);

		// add additional test code here
		assertNotNull(result);
		assertEquals("MusicCDSummary [cd_id=1, title=, artists=[], yearOfRelease=1, noOfTracks=1, toPlayingTimeInsec=1]", result.toString());
		assertEquals("", result.getTitle());
		assertEquals(new Long(1L), result.getToPlayingTimeInsec());
		assertEquals("0 min(s) 1sec(s)", result.getPlayingTimeStr());
		assertEquals(new Long(1L), result.getCd_id());
		assertEquals(new Integer(1), result.getYearOfRelease());
		assertEquals(new Integer(1), result.getNoOfTracks());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
		Object obj = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
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
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
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
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
		Object obj = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
		Object obj = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
		Object obj = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
		Object obj = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
		Object obj = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testEquals_9()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
		Object obj = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testEquals_10()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
		Object obj = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Set<Artist> getArtists() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testGetArtists_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

		Set<Artist> result = fixture.getArtists();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Long getCd_id() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testGetCd_id_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

		Long result = fixture.getCd_id();

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
	 * Run the Integer getNoOfTracks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testGetNoOfTracks_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

		Integer result = fixture.getNoOfTracks();

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
	 * Run the String getPlayingTimeStr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testGetPlayingTimeStr_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

		String result = fixture.getPlayingTimeStr();

		// add additional test code here
		assertEquals("0 min(s) 1sec(s)", result);
	}

	/**
	 * Run the String getTitle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testGetTitle_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

		String result = fixture.getTitle();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Long getToPlayingTimeInsec() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testGetToPlayingTimeInsec_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

		Long result = fixture.getToPlayingTimeInsec();

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
	 * Run the Integer getYearOfRelease() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testGetYearOfRelease_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

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
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary((Long) null, "", (Set<Artist>) null, new Integer(1), (Integer) null, new Long(1L));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(887503713, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), (String) null, new HashSet<>(), (Integer) null, new Integer(1), (Long) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(888456993, result);
	}

	/**
	 * Run the void setArtists(Set<Artist>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testSetArtists_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
		Set<Artist> artists = new HashSet<>();

		fixture.setArtists(artists);

		// add additional test code here
	}

	/**
	 * Run the void setCd_id(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testSetCd_id_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
		Long cd_id = new Long(1L);

		fixture.setCd_id(cd_id);

		// add additional test code here
	}

	/**
	 * Run the void setNoOfTracks(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testSetNoOfTracks_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
		Integer noOfTracks = new Integer(1);

		fixture.setNoOfTracks(noOfTracks);

		// add additional test code here
	}

	/**
	 * Run the void setTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testSetTitle_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
		String title = "";

		fixture.setTitle(title);

		// add additional test code here
	}

	/**
	 * Run the void setToPlayingTimeInsec(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testSetToPlayingTimeInsec_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
		Long toPlayingTimeInsec = new Long(1L);

		fixture.setToPlayingTimeInsec(toPlayingTimeInsec);

		// add additional test code here
	}

	/**
	 * Run the void setYearOfRelease(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testSetYearOfRelease_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));
		Integer yearOfRelease = new Integer(1);

		fixture.setYearOfRelease(yearOfRelease);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		MusicCDSummary fixture = new MusicCDSummary(new Long(1L), "", new HashSet<>(), new Integer(1), new Integer(1), new Long(1L));

		String result = fixture.toString();

		// add additional test code here
		assertEquals("MusicCDSummary [cd_id=1, title=, artists=[], yearOfRelease=1, noOfTracks=1, toPlayingTimeInsec=1]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/8/18 4:49 PM
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
	 * @generatedBy CodePro at 11/8/18 4:49 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

}