/**
 * 
 */
package com.mindtree.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Krithi
 *
 */
@Entity
@Table(name="MUSIC_CDS")
public class MusicCD {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cdId;
	private String title;
	private Integer yearOfRelease;
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "CD_ID")
	private List<MusicTrack> musicTracks;
	/**
	 * @param cdId
	 * @param title
	 * @param yearOfRelease
	 * @param musicTracks
	 */
	public MusicCD(Long cdId, String title, Integer yearOfRelease, List<MusicTrack> musicTracks) {
		super();
		this.cdId = cdId;
		this.title = title;
		this.yearOfRelease = yearOfRelease;
		this.musicTracks = musicTracks;
	}
	
	public MusicCD() {
	
	}

	/**
	 * @return the cdId
	 */
	public Long getCdId() {
		return cdId;
	}

	/**
	 * @param cdId the cdId to set
	 */
	public void setCdId(Long cdId) {
		this.cdId = cdId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the yearOfRelease
	 */
	public Integer getYearOfRelease() {
		return yearOfRelease;
	}

	/**
	 * @param yearOfRelease the yearOfRelease to set
	 */
	public void setYearOfRelease(Integer yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	/**
	 * @return the musicTracks
	 */
	public List<MusicTrack> getMusicTracks() {
		return musicTracks;
	}

	/**
	 * @param musicTracks the musicTracks to set
	 */
	public void setMusicTracks(List<MusicTrack> musicTracks) {
		this.musicTracks = musicTracks;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdId == null) ? 0 : cdId.hashCode());
		result = prime * result + ((musicTracks == null) ? 0 : musicTracks.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((yearOfRelease == null) ? 0 : yearOfRelease.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MusicCD other = (MusicCD) obj;
		if (cdId == null) {
			if (other.cdId != null)
				return false;
		} else if (!cdId.equals(other.cdId))
			return false;
		if (musicTracks == null) {
			if (other.musicTracks != null)
				return false;
		} else if (!musicTracks.equals(other.musicTracks))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearOfRelease == null) {
			if (other.yearOfRelease != null)
				return false;
		} else if (!yearOfRelease.equals(other.yearOfRelease))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MusicCD [cdId=" + cdId + ", title=" + title + ", yearOfRelease=" + yearOfRelease + ", musicTracks="
				+ musicTracks + "]";
	}
	
	
}
