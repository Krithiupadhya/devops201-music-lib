/**
 * 
 */
package com.mindtree.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.mindtree.dao.AbstractDao;
import com.mindtree.dao.MusicCDDao;
import com.mindtree.entity.MusicCD;

/**
 * @author Krithi
 *
 */
@Repository("musicCDDao")
public class MusicCDDaoHbmImpl extends AbstractDao<Long, MusicCD> implements MusicCDDao {

	/* (non-Javadoc)
	 * @see com.mindtree.dao.MusicCDDao#save(com.mindtree.entity.MusicCD)
	 */
	public void save(MusicCD musicCD) {
		persist(musicCD);
	}

	/* (non-Javadoc)
	 * @see com.mindtree.dao.MusicCDDao#getAll()
	 */
	@SuppressWarnings("unchecked")
	public List<MusicCD> getAll() {
		Criteria criteria =createEntityCriteria();
		return (List<MusicCD>)criteria.list();
	}

	/* (non-Javadoc)
	 * @see com.mindtree.dao.MusicCDDao#get(long)
	 */
	public MusicCD get(Long cdId) {
		return getByKey(cdId);
	}

}
