/**
 * 
 */
package com.mindtree.service;

import java.util.List;

import com.mindtree.dto.MusicCDSummary;
import com.mindtree.entity.MusicCD;
import com.mindtree.exception.ApplicationException;

/**
 * @author Krithi
 *
 */
public interface MusicService {

	public List<MusicCDSummary> fetchAll() throws ApplicationException;
	
	public MusicCD getMusicCDDetails(Long cdId) throws ApplicationException;
	
	public MusicCD saveMusicCdDetails(MusicCD musicCD ) throws ApplicationException;
	
}
