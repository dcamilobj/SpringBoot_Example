/**
 * 
 */
package co.edu.udea.semaforov2.dto;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Duban Camilo Bedoya - dcamilobj@gmail.com
 * @version 1.0.0
 */
@Entity
@Table(name="Trail")
public class Trail{
	
	@Id
	@Column(name="trail_id")
	private int trailId;
	
	@Column(name="trail_name")
	private String trailName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="trail_id")
	private Collection<SpaceByTrail> spaceByTrailCollection;

	/**
	 * @return the trailId
	 */
	public int getTrailId() {
		return trailId;
	}

	/**
	 * @param trailId the trailId to set
	 */
	public void setTrailId(int trailId) {
		this.trailId = trailId;
	}

	/**
	 * @return the trailName
	 */
	public String getTrailName() {
		return trailName;
	}

	/**
	 * @param trailName the trailName to set
	 */
	public void setTrailName(String trailName) {
		this.trailName = trailName;
	}
	
	

}
