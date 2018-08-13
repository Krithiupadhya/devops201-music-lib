/**
 * 
 */
package com.mindtree.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.MusicCDDao;
import com.mindtree.dto.MusicCDSummary;
import com.mindtree.entity.MusicCD;
import com.mindtree.entity.MusicTrack;
import com.mindtree.exception.ApplicationException;

/**
 * @author Krithi
 *
 */
@Service("musicService")
@Transactional
public class MusicServiceImpl implements MusicService {

	private static final Logger logger = Logger.getLogger(MusicServiceImpl.class);
	
	@Autowired
	private MusicCDDao musicCDDao;
	
	public List<MusicCDSummary> fetchAll() throws ApplicationException{
		
		List<MusicCDSummary> musicCDSummaries=new ArrayList<>();
		try {
			List<MusicCD> musicCDs = musicCDDao.getAll();
			musicCDSummaries = musicCDs.stream()
					.map(music -> new MusicCDSummary(music.getCdId(), music.getTitle(),
							music.getMusicTracks().stream().flatMap(tracks -> tracks.getArtists().stream())
									.map(artist -> artist).collect(Collectors.toSet()),
							music.getYearOfRelease(),
							music.getMusicTracks() != null ? music.getMusicTracks().size() : 0,
							music.getMusicTracks().stream().mapToLong(tracks -> tracks.getPlayingSec()).sum()))
					.collect(Collectors.toList());
		} catch (Exception e) {
			logger.error("Error while fetching music CD list: "+e.getMessage());
			throw new ApplicationException(e);
		}

		return musicCDSummaries;
	}

	public MusicCD getMusicCDDetails(Long cdId) throws ApplicationException{
		
		MusicCD musicCD=null;
		try {
			musicCD = musicCDDao.get(cdId);
			for (MusicTrack track : musicCD.getMusicTracks()) {
				track.equals(new MusicTrack());
				int size=(track.getArtists()!=null)?track.getArtists().size():0;
				logger.info("Size of artists array:"+size);
			} 
		} catch (Exception e) {
			logger.error("Error while fetching music CD details: "+e.getMessage());
			throw new ApplicationException(e);
		}
		return musicCD;
	}

	@Override
	public MusicCD saveMusicCdDetails(MusicCD musicCD) throws ApplicationException {
		try {
			musicCDDao.save(musicCD);
		} catch (Exception e) {
			logger.error("Error while saving music CD details: "+e.getMessage());
			throw new ApplicationException(e);
		}
		return musicCD;
	}

}
