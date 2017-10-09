package co.edu.udea.semaforov2.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "Permissions_By_Color")
public class PermissionsByColor  {

	@Id
	@Column(name="permissions_by_notification_color_id")
	private int permissionsByNotificationColorId;
	
	@JoinColumn(name="user_id", referencedColumnName="user_id")
	@ManyToOne(optional=false)
	@Column(name="user_id")
	private User userId;
	
	@JoinColumn(name="notification_color_id", referencedColumnName="notification_color_id")
	@ManyToOne(optional=false)
	@Column(name="notification_color_id")
	private NotificationColor notificationColorId;

	/**
	 * @return the permissionsByNotificationColorId
	 */
	public int getPermissionsByNotificationColorId() {
		return permissionsByNotificationColorId;
	}

	/**
	 * @param permissionsByNotificationColorId the permissionsByNotificationColorId to set
	 */
	public void setPermissionsByNotificationColorId(int permissionsByNotificationColorId) {
		this.permissionsByNotificationColorId = permissionsByNotificationColorId;
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

	/**
	 * @return the notificationColorId
	 */
	public NotificationColor getNotificationColorId() {
		return notificationColorId;
	}

	/**
	 * @param notificationColorId the notificationColorId to set
	 */
	public void setNotificationColorId(NotificationColor notificationColorId) {
		this.notificationColorId = notificationColorId;
	}
	
	
	
}

