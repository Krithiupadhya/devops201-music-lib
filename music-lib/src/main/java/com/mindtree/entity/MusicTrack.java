/**
 * 
 */
package com.mindtree.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Krithi
 *
 */
@Entity
@Table(name="MUSIC_TRACKS")
public class MusicTrack {

	@Id
	@Column(name="TRACK_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long trackId;
	@Column(name="TITLE")
	private String title;
	@Column(name="AUTHOR")
	private String author;
	@Column(name="PLAYING_SEC")
	private Long playingSec;
	@ManyToMany
	@JoinTable(name = "MUSIC_TRACK_ARTISTS", joinColumns = { @JoinColumn(name = "TRACK_ID") }, inverseJoinColumns = { @JoinColumn(name = "ARTIST_ID") })
	private List<Artist> artists;
	
	
	/**
	 * @param trackId
	 * @param title
	 * @param author
	 * @param playingSec
	 * @param artists
	 */
	public MusicTrack(Long trackId, String title, String author, Long playingSec, List<Artist> artists) {
		super();
		this.trackId = trackId;
		this.title = title;
		this.author = author;
		this.playingSec = playingSec;
		this.artists = artists;
	}

	public MusicTrack() {
	}

	/**
	 * @return the trackId
	 */
	public Long getTrackId() {
		return trackId;
	}

	/**
	 * @param trackId the trackId to set
	 */
	public void setTrackId(Long trackId) {
		this.trackId = trackId;
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
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the playingSec
	 */
	public Long getPlayingSec() {
		return playingSec;
	}

	/**
	 * @param playingSec the playingSec to set
	 */
	public void setPlayingSec(Long playingSec) {
		this.playingSec = playingSec;
	}

	/**
	 * @return the artists
	 */
	public List<Artist> getArtists() {
		return artists;
	}

	/**
	 * @param artists the artists to set
	 */
	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artists == null) ? 0 : artists.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((playingSec == null) ? 0 : playingSec.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((trackId == null) ? 0 : trackId.hashCode());
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
		MusicTrack other = (MusicTrack) obj;
		if (artists == null) {
			if (other.artists != null)
				return false;
		} else if (!artists.equals(other.artists))
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (playingSec == null) {
			if (other.playingSec != null)
				return false;
		} else if (!playingSec.equals(other.playingSec))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (trackId == null) {
			if (other.trackId != null)
				return false;
		} else if (!trackId.equals(other.trackId))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MusicTrack [trackId=" + trackId + ", title=" + title + ", author=" + author + ", playingSec="
				+ playingSec + ", artists=" + artists + "]";
	}
	
	
}
