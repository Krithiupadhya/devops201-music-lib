/**
 * 
 */
package com.mindtree.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.ArtistDao;
import com.mindtree.dao.MusicCDDao;
import com.mindtree.dto.MusicCDSummary;
import com.mindtree.entity.Artist;
import com.mindtree.entity.MusicCD;
import com.mindtree.entity.MusicTrack;

/**
 * @author Krithi
 *
 */
@Service("musicService")
@Transactional
public class MusicServiceImpl implements MusicService {

	@Autowired
	private MusicCDDao musicCDDao;
	@Autowired
	private ArtistDao artistDao;
	
	public List<MusicCDSummary> fetchAll(){
		
		List<MusicCD> musicCDs = musicCDDao.getAll();
		List<MusicCDSummary> musicCDSummaries =musicCDs.stream().map(music-> 
			new MusicCDSummary(music.getCdId(), music.getTitle()
					,music.getMusicTracks().stream().flatMap(tracks->tracks.getArtists().stream()).map(artist->artist).collect(Collectors.toSet())
					, music.getYearOfRelease()
					, music.getMusicTracks()!=null ? music.getMusicTracks().size(): 0,
					music.getYearOfRelease())
				)
		.collect(Collectors.toList());

		return musicCDSummaries;
	}

	public MusicCD getMusicCDDetails(Long cdId) {
		
		MusicCD musicCD = musicCDDao.get(cdId);
		for (MusicTrack track: musicCD.getMusicTracks()) {
			System.out.println(track);
		}
		return musicCD;
	}

	@Override
	public MusicCD saveMusicCdDetails(MusicCD musicCD) {
		musicCDDao.save(musicCD);
		return musicCD;
	}

	@Override
	public List<Artist> fetchAllArtists() {
		return artistDao.findAllArtists();
	}

	@Override
	public Artist saveArtistDetails(Artist artist) {
		artistDao.save(artist);
		return artist;
	}
}
