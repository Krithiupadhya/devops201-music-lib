/**
 * 
 */
package com.mindtree.daoimpl;

import java.util.List;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mindtree.dao.AbstractDaoTest;
import com.mindtree.dao.ArtistDao;
import com.mindtree.entity.Artist;

/**
 * @author Krithi
 *
 */
@WebAppConfiguration
public class ArtistDaoHbmImplTest extends AbstractDaoTest {

	@Autowired
	private ArtistDao artistDao; 
	@Override
	protected IDataSet getDataSet() throws Exception {
		IDataSet dataSet = new FlatXmlDataSet(this.getClass().getClassLoader().getResourceAsStream("artist_data.xml"));
        return dataSet;
	}

	@Before
	public void setup() throws Exception {
		super.setUp();
	}
	
	 @Test
	 public void fetchAllArtists() {
		 List<Artist> artists=artistDao.findAllArtists();
		 Assert.assertEquals(artists.size(),4);
	 }
	
	@Test
	public void saveArtist() {
		Artist artist=new Artist(null, "My Artist");
		artistDao.save(artist);
		
		List<Artist> artists=artistDao.findAllArtists();
		Assert.assertEquals(artists.size(),5);
	}
}
