/**
 * 
 */
package com.mindtree.daoimpl;

import com.mindtree.dao.AbstractDao;
import com.mindtree.dao.MusicTrackDao;
import com.mindtree.entity.MusicTrack;

/**
 * @author Krithi
 *
 */
public class MusicTrackDaoHmbImpl extends AbstractDao<Long, MusicTrack> implements MusicTrackDao {

	/* (non-Javadoc)
	 * @see com.mindtree.dao.MusicTrackDao#save(com.mindtree.entity.MusicTrack)
	 */
	public void save(MusicTrack musicTrack) {
		persist(musicTrack);
	}

}
