/**
 * 
 */
package com.mindtree.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mindtree.configuration.AppInitializer;
import com.mindtree.dao.MusicCDDao;
import com.mindtree.dto.MusicCDSummary;
import com.mindtree.entity.Artist;
import com.mindtree.entity.MusicCD;
import com.mindtree.entity.MusicTrack;
import com.mindtree.exception.ApplicationException;

/**
 * @author Krithi
 *
 */
@WebAppConfiguration
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration(classes = {AppInitializer.class }, loader=AnnotationConfigWebContextLoader.class)
public class MusicServiceImplTest {

	@Mock
	private static MusicCDDao musicCDDao;
	@InjectMocks
	private MusicService musicService= new MusicServiceImpl();
	
	
	private static List<MusicCD> musicCDs= new ArrayList<>();
	
	@BeforeClass
	public static void setup(){
		Artist artist = new Artist(1L, "Art1");
		Artist artist1 = new Artist(2L, "Art2");
		List<Artist> artists= new ArrayList<>();
		artists.add(artist1);
		artists.add(artist);
		
		MusicTrack track1= new MusicTrack(null, "Track1", "Auth1", 100L, artists);
		MusicTrack track2= new MusicTrack(null, "Track2", "Auth2", 200L, artists);
		List<MusicTrack> musicTracks=new ArrayList<>();
		musicTracks.add(track1);
		musicTracks.add(track2);
		
		MusicCD musicCD = new MusicCD(null, "Title 1", 2019, musicTracks);
		musicCDs.add(musicCD);

	}
	
	@Before
    public void setupMock() {
		 MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void fetchAllMusicCDs() {
		Mockito.when(musicCDDao.getAll()).thenReturn(musicCDs);
		
		try {
			List<MusicCDSummary> cdSummaries = musicService.fetchAll();
			assertEquals(cdSummaries.size(), 1);
		} catch (ApplicationException e) {
			fail("Exception thrown incorrectly::"+e.getMessage());
		}
	}
	

	@Test(expected= ApplicationException.class)
	public void exceptionInFetchAllMusicCDs() throws ApplicationException {

		Mockito.when(musicCDDao.getAll()).thenThrow(new RuntimeException("Exception while fetching CD Details"));
		musicService.fetchAll();
		fail("Exception not thrown");
	}

	@Test
	public void getMusicCDDetails(){
		
		Mockito.when(musicCDDao.get(1L)).thenReturn(musicCDs.get(0));
		try {
			MusicCD musicCD = musicService.getMusicCDDetails(1L);
			assertEquals(true, musicCD.equals(musicCDs.get(0)));
		} catch (Exception e) {
			fail("Exception thrown incorrectly::"+e.getMessage());
		}
	}

	

	@Test(expected= ApplicationException.class)
	public void exceptionIngetMusicCDDetails() throws ApplicationException {

		Mockito.when(musicCDDao.get(1L)).thenThrow(new RuntimeException("Exception while fetching CD Details"));
		musicService.getMusicCDDetails(1L);
		fail("Exception not thrown");
	}

	@Test
	public void saveMusicCD() {
		
		Mockito.doNothing().when(musicCDDao).save(musicCDs.get(0));
		try {
			musicService.saveMusicCdDetails(musicCDs.get(0));
		} catch (ApplicationException e) {
			fail("Exception thrown incorrectly::"+e.getMessage());
		}
	}
	
	@Test(expected=ApplicationException.class)
	public void exceptionInSaveMusicCD() throws ApplicationException {
		
		Mockito.doThrow(new RuntimeException()).when(musicCDDao).save(musicCDs.get(0));
		musicService.saveMusicCdDetails(musicCDs.get(0));
		fail("Exception not thrown");
	}
	

}
