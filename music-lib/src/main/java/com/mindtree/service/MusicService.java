/**
 * 
 */
package com.mindtree.service;

import java.util.List;

import com.mindtree.dto.MusicCDSummary;
import com.mindtree.entity.Artist;
import com.mindtree.entity.MusicCD;

/**
 * @author Krithi
 *
 */
public interface MusicService {

	public List<MusicCDSummary> fetchAll();
	
	public MusicCD getMusicCDDetails(Long cdId);
	
	public MusicCD saveMusicCdDetails(MusicCD musicCD );
	
	public List<Artist> fetchAllArtists();
	
	public Artist saveArtistDetails(Artist artist);
}
