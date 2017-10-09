/**
 * 
 */
package co.edu.udea.semaforov2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Duban Camilo Bedoya - dcamilobj@gmail.com
 * @version 1.0.0
 */

@Entity
@Table(name="Space_By_Trail")
public class SpaceByTrail{

	@Id
	@Column(name="space_by_trail_id")
	private int spaceByTrailId;
	
	@JoinColumn(name="space_id", referencedColumnName="space_id")
	@ManyToOne(optional=false)
	private Space spaceId;
	
	@JoinColumn(name="trail_id", referencedColumnName="trail_id")
	@ManyToOne(optional=false)
	private Trail trailId;

	/**
	 * @return the spaceByTrailId
	 */
	public int getSpaceByTrailId() {
		return spaceByTrailId;
	}

	/**
	 * @param spaceByTrailId the spaceByTrailId to set
	 */
	public void setSpaceByTrailId(int spaceByTrailId) {
		this.spaceByTrailId = spaceByTrailId;
	}

	/**
	 * @return the spaceId
	 */
	public Space getSpaceId() {
		return spaceId;
	}

	/**
	 * @param spaceId the spaceId to set
	 */
	public void setSpaceId(Space spaceId) {
		this.spaceId = spaceId;
	}

	/**
	 * @return the trailId
	 */
	public Trail getTrailId() {
		return trailId;
	}

	/**
	 * @param trailId the trailId to set
	 */
	public void setTrailId(Trail trailId) {
		this.trailId = trailId;
	}
	
	
}
