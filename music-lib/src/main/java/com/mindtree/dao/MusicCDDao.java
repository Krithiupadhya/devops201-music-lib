/**
 * 
 */
package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.MusicCD;

/**
 * @author Krithi
 *
 */
public interface MusicCDDao {

	/**
	 * 
	 * @param musicCD
	 */
	public void save(MusicCD musicCD) ;
	
	/**
	 * 
	 * @return
	 */
	public List<MusicCD> getAll() ;
	
	/**
	 * 
	 * @param cdId
	 * @return
	 */
	public MusicCD get(Long cdId) ;
	
}
