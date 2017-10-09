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
 * @author Duban Camilo Bedoya  - dcamilobj@gmail.com
 * @version	 1.0.0
 */
@Entity
@Table(name="User")
public class User{
	
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="name")
	private String name; 
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="role")
	private int role;
	
	@Column(name="sender_id")
	private String senderId;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="user_id")
	private Collection<Tracing> tracingCollection;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="user_id")
	private Collection<PermissionsBySpace> permissionsBySpaceCollection;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="user_id")
	private Collection<SpacesBelongToUser> spacesBelongToUserCollection;
	

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the role
	 */
	public int getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(int role) {
		this.role = role;
	}

	/**
	 * @return the senderId
	 */
	public String getSenderId() {
		return senderId;
	}

	/**
	 * @param senderId the senderId to set
	 */
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	
	
}
