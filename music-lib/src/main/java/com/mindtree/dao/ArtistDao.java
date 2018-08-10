/**
 * 
 */
package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Artist;

/**
 * @author Krithi
 *
 */
public interface ArtistDao {
	
	/**
	 * 
	 * @param artist
	 */
	public void save(Artist artist);
	
	/**
	 * 
	 * @return
	 */
	public List<Artist> findAllArtists() ;
}
