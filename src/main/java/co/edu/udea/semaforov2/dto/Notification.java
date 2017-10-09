package co.edu.udea.semaforov2.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name = "notification")
public class Notification implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
    @Column(name = "notification_id")
    private Integer notificationId;
    @Basic(optional = false)
    @Column(name = "notification_state")
    private boolean notificationState;
    @Basic(optional = false)
    @Column(name = "message")
    private String message;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Basic(optional = false)
    @Column(name = "ejecution_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ejecutionDate;
    @JoinColumn(name = "notification_type_id", referencedColumnName = "notification_type_id")
    @ManyToOne(optional = false)
    private NotificationType notificationTypeId;
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User createdBy;

    public Notification() {
    }

    public Notification(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public Notification(Integer notificationId, boolean notificationState, String message, String title, Date creationDate, Date ejecutionDate) {
        this.notificationId = notificationId;
        this.notificationState = notificationState;
        this.message = message;
        this.title = title;
        this.creationDate = creationDate;
        this.ejecutionDate = ejecutionDate;
    }

    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public boolean getNotificationState() {
        return notificationState;
    }

    public void setNotificationState(boolean notificationState) {
        this.notificationState = notificationState;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getEjecutionDate() {
        return ejecutionDate;
    }

    public void setEjecutionDate(Date ejecutionDate) {
        this.ejecutionDate = ejecutionDate;
    }

    public NotificationType getNotificationTypeId() {
        return notificationTypeId;
    }

    public void setNotificationTypeId(NotificationType notificationTypeId) {
        this.notificationTypeId = notificationTypeId;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

}
