/**
 * 
 */
package co.edu.udea.semaforov2.dto;

import java.util.Collection;
import java.util.Date;

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
@Table(name="Space")
public class Space {

	@Id
	@Column(name="space_id")
	private int spaceId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="creation_date")
	private Date creationDate;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="space_id")
	private Collection<PermissionsBySpace> permissionsBySpaceCollection;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="space_id")
	private Collection<SpacesBelongToUser> spacesBelongToUserCollection;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="space_id")
	private Collection<SpaceByTrail> spaceByTrailCollection;

	/**
	 * @return the spaceId
	 */
	public int getSpaceId() {
		return spaceId;
	}

	/**
	 * @param spaceId the spaceId to set
	 */
	public void setSpaceId(int spaceId) {
		this.spaceId = spaceId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
