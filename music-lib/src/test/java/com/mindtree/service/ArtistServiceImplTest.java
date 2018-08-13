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
import com.mindtree.dao.ArtistDao;
import com.mindtree.entity.Artist;
import com.mindtree.exception.ApplicationException;

/**
 * @author Krithi
 *
 */
@WebAppConfiguration
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration(classes = {AppInitializer.class }, loader=AnnotationConfigWebContextLoader.class)
public class ArtistServiceImplTest {

	@Mock
    private ArtistDao artistDao;
	
	@InjectMocks
	ArtistService artistService=new ArtistServiceImpl();

	private static List<Artist> artists= new ArrayList<>();
	
	@BeforeClass
	public static void setup(){
		Artist artist = new Artist(1L, "Art1");
		Artist artist1 = new Artist(2L, "Art2");

		artists.add(artist1);
		artists.add(artist);
		
	}
	
	@Before
    public void setupMock() {
		 MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void fetchAllArtists() {

		Mockito.when(artistDao.findAllArtists()).thenReturn(artists);
		try {
			assertEquals(2,artistService.fetchAllArtists().size());
		} catch (ApplicationException e) {
			fail("Exception thrown incorrectly::"+e.getMessage());
		}
	
	}
	
	@Test(expected= ApplicationException.class)
	public void exceptionInFetchAllArtists() throws ApplicationException {

		Mockito.when(artistDao.findAllArtists()).thenThrow(new RuntimeException("Exception while fetching all artists"));
		artistService.fetchAllArtists();
		fail("Exception not thrown");
	}
	
	@Test
	public void saveArtist() {
		Artist artist=new Artist(null, "My Artist");
		
		Mockito.doNothing().when(artistDao).save(artist);
		try {
			artistService.saveArtistDetails(artist);
		} catch (ApplicationException e) {
			fail("Exception thrown incorrectly::"+e.getMessage());
		}
	}
	
	@Test(expected=ApplicationException.class)
	public void exceptionInSaveArtist() throws ApplicationException {
		Artist artist=new Artist(null, "My Artist");
		
		Mockito.doThrow(new RuntimeException()).when(artistDao).save(artist);
		artistService.saveArtistDetails(artist);
	}
}
