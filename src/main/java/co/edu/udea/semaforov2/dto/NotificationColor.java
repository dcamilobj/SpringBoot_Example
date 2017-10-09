package co.edu.udea.semaforov2.dto;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "notification_color")
public class NotificationColor implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional = false)
    @Column(name = "notification_color_id")
    private Integer notificationColorId;
	@Basic(optional = false)
    @Column(name = "color")
    private String color;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "notification_color_id")
    private Collection<NotificationType> notificationTypeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "notification_color_id")
    private Collection<NotificationMessageBank> notificationMessageBankCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "notification_color_id")
    private Collection<PermissionsByColor> permissionsByColorCollection;

    public NotificationColor() {
    }

    public NotificationColor(Integer notificationColorId) {
        this.notificationColorId = notificationColorId;
    }

    public NotificationColor(Integer notificationColorId, String color) {
        this.notificationColorId = notificationColorId;
        this.color = color;
    }

    public Integer getNotificationColorId() {
        return notificationColorId;
    }

    public void setNotificationColorId(Integer notificationColorId) {
        this.notificationColorId = notificationColorId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
