/**
 * 
 */
package com.mindtree.dto;

import java.util.Set;

import com.mindtree.entity.Artist;

/**
 * @author Krithi
 *
 */
public class MusicCDSummary {

	private Long cd_id;
	private String title;
	private Set<Artist> artists;
	private Integer yearOfRelease;
	private Integer noOfTracks;
	private Long toPlayingTimeInsec;
	
	public MusicCDSummary() {
	}

	
	/**
	 * @param cd_id
	 * @param title
	 * @param artists
	 * @param yearOfRelease
	 * @param noOfTracks
	 * @param toPlayingTimeInsec
	 */
	public MusicCDSummary(Long cd_id, String title, Set<Artist> artists, Integer yearOfRelease, Integer noOfTracks,
			Long toPlayingTimeInsec) {
		super();
		this.cd_id = cd_id;
		this.title = title;
		this.artists = artists;
		this.yearOfRelease = yearOfRelease;
		this.noOfTracks = noOfTracks;
		this.toPlayingTimeInsec = toPlayingTimeInsec;
	}


	/**
	 * @return the cd_id
	 */
	public Long getCd_id() {
		return cd_id;
	}


	/**
	 * @param cd_id the cd_id to set
	 */
	public void setCd_id(Long cd_id) {
		this.cd_id = cd_id;
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
	 * @return the artists
	 */
	public Set<Artist> getArtists() {
		return artists;
	}


	/**
	 * @param artists the artists to set
	 */
	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
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
	 * @return the noOfTracks
	 */
	public Integer getNoOfTracks() {
		return noOfTracks;
	}


	/**
	 * @param noOfTracks the noOfTracks to set
	 */
	public void setNoOfTracks(Integer noOfTracks) {
		this.noOfTracks = noOfTracks;
	}


	/**
	 * @return the toPlayingTimeInsec
	 */
	public Long getToPlayingTimeInsec() {
		return toPlayingTimeInsec;
	}


	/**
	 * @param toPlayingTimeInsec the toPlayingTimeInsec to set
	 */
	public void setToPlayingTimeInsec(Long toPlayingTimeInsec) {
		this.toPlayingTimeInsec = toPlayingTimeInsec;
	}

	public String getPlayingTimeStr() {
		return toPlayingTimeInsec/60+" min(s) "+toPlayingTimeInsec%60 +"sec(s)";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artists == null) ? 0 : artists.hashCode());
		result = prime * result + ((cd_id == null) ? 0 : cd_id.hashCode());
		result = prime * result + ((noOfTracks == null) ? 0 : noOfTracks.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((toPlayingTimeInsec == null) ? 0 : toPlayingTimeInsec.hashCode());
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
		MusicCDSummary other = (MusicCDSummary) obj;
		if (artists == null) {
			if (other.artists != null)
				return false;
		} else if (!artists.equals(other.artists))
			return false;
		if (cd_id == null) {
			if (other.cd_id != null)
				return false;
		} else if (!cd_id.equals(other.cd_id))
			return false;
		if (noOfTracks == null) {
			if (other.noOfTracks != null)
				return false;
		} else if (!noOfTracks.equals(other.noOfTracks))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (toPlayingTimeInsec == null) {
			if (other.toPlayingTimeInsec != null)
				return false;
		} else if (!toPlayingTimeInsec.equals(other.toPlayingTimeInsec))
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
		return "MusicCDSummary [cd_id=" + cd_id + ", title=" + title + ", artists=" + artists + ", yearOfRelease="
				+ yearOfRelease + ", noOfTracks=" + noOfTracks + ", toPlayingTimeInsec=" + toPlayingTimeInsec + "]";
	}

	
}
