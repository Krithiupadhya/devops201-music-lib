/**
 * 
 */
package com.mindtree.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Krithi
 *
 */
@Entity
@Table(name="ARTISTS")
public class Artist {
	@Id
	@Column(name="ARTIST_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long artistId;
	private String artistName;
	/**
	 * @param artistId
	 * @param artistName
	 */
	public Artist(Long artistId, String artistName) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
	}
	public Artist() {
	}
	/**
	 * @return the artistId
	 */
	
	public Long getArtistId() {
		return artistId;
	}
	/**
	 * @param artistId the artistId to set
	 */
	public void setArtistId(Long artistId) {
		this.artistId = artistId;
	}
	/**
	 * @return the artistName
	 */
	public String getArtistName() {
		return artistName;
	}
	/**
	 * @param artistName the artistName to set
	 */
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artistId == null) ? 0 : artistId.hashCode());
		result = prime * result + ((artistName == null) ? 0 : artistName.hashCode());
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
		Artist other = (Artist) obj;
		if (artistId == null) {
			if (other.artistId != null)
				return false;
		} else if (!artistId.equals(other.artistId))
			return false;
		if (artistName == null) {
			if (other.artistName != null)
				return false;
		} else if (!artistName.equals(other.artistName))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", artistName=" + artistName + "]";
	}	
	
}
