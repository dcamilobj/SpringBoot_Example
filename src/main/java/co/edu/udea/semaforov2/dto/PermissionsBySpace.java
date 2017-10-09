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
@Table(name="Permissions_By_Space")
public class PermissionsBySpace {
	
	@Id
	@Column(name="permissions_by_space_id")
	private int permissionsBySpaceId;
	
	@JoinColumn(name="space_id", referencedColumnName="space_id")
	@ManyToOne(optional=false)
	private Space spaceId;
	
	@JoinColumn(name="user_id", referencedColumnName="user_id")
	@ManyToOne(optional=false)
	private User userId;

	/**
	 * @return the permissionsBySpaceId
	 */
	public int getPermissionsBySpaceId() {
		return permissionsBySpaceId;
	}

	/**
	 * @param permissionsBySpaceId the permissionsBySpaceId to set
	 */
	public void setPermissionsBySpaceId(int permissionsBySpaceId) {
		this.permissionsBySpaceId = permissionsBySpaceId;
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
