/**
 * 
 */
package com.mindtree.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.dao.AbstractDaoTest;
import com.mindtree.dao.MusicCDDao;
import com.mindtree.entity.Artist;
import com.mindtree.entity.MusicCD;
import com.mindtree.entity.MusicTrack;

/**
 * @author Krithi
 *
 */
public class MusicCDDaoHbmImplTest extends AbstractDaoTest{

	@Autowired
	MusicCDDao musicCDDao;
	
	@Override
	protected IDataSet getDataSet() throws Exception {
		IDataSet dataSet = new FlatXmlDataSet(this.getClass().getClassLoader().getResourceAsStream("music_cd_data.xml"));
        return dataSet;
	}

	@Before
	public void setup() throws Exception {
		super.setUp();
	}

	@Test
	public void saveAndFetch() {
		
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
		musicCDDao.save(musicCD);
		
		Assert.assertEquals((Long)musicCD.getCdId(),(Long)3L);
		Assert.assertEquals((Long)musicCD.getMusicTracks().get(0).getTrackId(),(Long)5L);
		Assert.assertEquals((Long)musicCD.getMusicTracks().get(1).getTrackId(),(Long)6L);
		
		MusicCD musicCD2 = musicCDDao.get(musicCD.getCdId());
		Assert.assertEquals(true, musicCD.equals(musicCD2));
	}
	
	@Test
	public void fetchAll() {
		List<MusicCD> musicCDs= musicCDDao.getAll();
		Assert.assertEquals(musicCDs.size(), 2);
	}


}
