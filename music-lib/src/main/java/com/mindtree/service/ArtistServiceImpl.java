/**
 * 
 */
package com.mindtree.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.ArtistDao;
import com.mindtree.entity.Artist;
import com.mindtree.exception.ApplicationException;

/**
 * @author Krithi
 *
 */
@Service("artistService")
@Transactional
public class ArtistServiceImpl implements ArtistService {

	private static final Logger logger = Logger.getLogger(ArtistServiceImpl.class);
	
	@Autowired
    private ArtistDao artistDao;
	@Override
	public List<Artist> fetchAllArtists() throws ApplicationException {
		try {
			return artistDao.findAllArtists();
		} catch (Exception e) {
			logger.error("Error while fetching all artist details: "+e.getMessage());
			throw new ApplicationException(e);
		}
	}

	@Override
	public Artist saveArtistDetails(Artist artist) throws ApplicationException {
		try {
			artistDao.save(artist);
		} catch (Exception e) {
			logger.error("Error while saving artist details: "+e.getMessage());
			throw new ApplicationException(e);
		}
		return artist;
	}

}
