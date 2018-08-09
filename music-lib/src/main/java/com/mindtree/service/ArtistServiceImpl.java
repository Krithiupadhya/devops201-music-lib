/**
 * 
 */
package com.mindtree.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.ArtistDao;
import com.mindtree.entity.Artist;

/**
 * @author Krithi
 *
 */
@Service("articeService")
@Transactional
public class ArtistServiceImpl implements ArtistService {

	@Autowired
    private ArtistDao artistDao;
	/* (non-Javadoc)
	 * @see com.mindtree.service.ArtistService#saveArtistDetails(com.mindtree.entity.Artist)
	 */
	public void saveArtistDetails(Artist artist) {
		artistDao.save(artist);
	}

	/* (non-Javadoc)
	 * @see com.mindtree.service.ArtistService#fetchAllArtists()
	 */
	public List<Artist> fetchAllArtists() {

		return artistDao.findAllArtists();
	}

}
