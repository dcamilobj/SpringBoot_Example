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
@Table(name="Spaces_Belong_To_User")
public class SpacesBelongToUser{

	@Id
	@Column(name="spaces_belong_to_user_id")
	private int spacesBelongToUserId;
	
	@JoinColumn(name="space_id", referencedColumnName="space_id")
	@ManyToOne(optional=false)
	private Space spaceId;
	
	@JoinColumn(name="user_id", referencedColumnName="user_id")
	@ManyToOne(optional=false)
	private User userId;

	/**
	 * @return the spacesBelongToUserId
	 */
	public int getSpacesBelongToUserId() {
		return spacesBelongToUserId;
	}

	/**
	 * @param spacesBelongToUserId the spacesBelongToUserId to set
	 */
	public void setSpacesBelongToUserId(int spacesBelongToUserId) {
		this.spacesBelongToUserId = spacesBelongToUserId;
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
	 * @return the userId
	 */
	public User getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(User userId) {
		this.userId = userId;
	}
	
		
}
