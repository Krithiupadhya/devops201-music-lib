package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Artist;
import com.mindtree.exception.ApplicationException;

/**
 * 
 */

/**
 * @author Krithi
 *
 */
public interface ArtistService {
	
	/**
	 * 
	 * @param artist
	 */
	public Artist saveArtistDetails(Artist artist) throws ApplicationException;
	
	/**
	 * 
	 * @return
	 */
	public List<Artist> fetchAllArtists() throws ApplicationException;
}
