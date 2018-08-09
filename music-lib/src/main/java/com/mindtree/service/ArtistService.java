package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Artist;

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
	public void saveArtistDetails(Artist artist);
	
	/**
	 * 
	 * @return
	 */
	public List<Artist> fetchAllArtists();
}
