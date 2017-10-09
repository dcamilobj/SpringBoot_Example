package co.edu.udea.semaforov2.dto;

import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name = "notification_type")
public class NotificationType {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
    @Column(name = "notification_type_id")
    private Integer notificationTypeId;
	@Basic(optional = false)
    @Column(name = "notification_Type")
    private String notificationType;
    @JoinColumn(name = "notification_color_id", referencedColumnName = "notification_color_id")
    @ManyToOne(optional = false)
    private NotificationColor notificationColorId;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "notificationTypeId")
    private Collection<Notification> notificationCollection;

    public NotificationType() {
    }

    public NotificationType(Integer notificationTypeId) {
        this.notificationTypeId = notificationTypeId;
    }

    public NotificationType(Integer notificationTypeId, String notificationType) {
        this.notificationTypeId = notificationTypeId;
        this.notificationType = notificationType;
    }

    public Integer getNotificationTypeId() {
        return notificationTypeId;
    }

    public void setNotificationTypeId(Integer notificationTypeId) {
        this.notificationTypeId = notificationTypeId;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public NotificationColor getNotificationColorId() {
        return notificationColorId;
    }

    public void setNotificationColorId(NotificationColor notificationColorId) {
        this.notificationColorId = notificationColorId;
    }
}
