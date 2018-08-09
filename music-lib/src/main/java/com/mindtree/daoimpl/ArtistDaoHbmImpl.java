/**
 * 
 */
package com.mindtree.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.mindtree.dao.AbstractDao;
import com.mindtree.dao.ArtistDao;
import com.mindtree.entity.Artist;

/**
 * @author Krithi
 *
 */
@Repository("artistDao")
public class ArtistDaoHbmImpl extends AbstractDao<Integer, Artist> implements ArtistDao {

	/* (non-Javadoc)
	 * @see com.mindtree.dao.ArtistDao#save(com.mindtree.entity.Artist)
	 */
	public void save(Artist artist) {
		persist(artist);
	}
	
	@SuppressWarnings("unchecked")
	public List<Artist> findAllArtists() {
		Criteria criteria = createEntityCriteria();
        return (List<Artist>) criteria.list();
	}

}
