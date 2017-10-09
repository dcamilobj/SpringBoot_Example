package co.edu.udea.semaforov2.dto;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "notification_message_bank")
public class NotificationMessageBank implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "notification_message_bank_id")
    private Integer notificationMessageBankId;
	
    @Basic(optional = false)
    @Column(name = "notification_title")
    private String notificationTitle;
    
    @Basic(optional = false)
    @Column(name = "notification_message")
    private String notificationMessage;
    
    @JoinColumn(name = "notification_color_id", referencedColumnName = "notification_color_id")
    @ManyToOne(optional = false)
    private NotificationColor notificationColorId;

    public NotificationMessageBank() {
    }

    public NotificationMessageBank(Integer notificationMessageBankId) {
        this.notificationMessageBankId = notificationMessageBankId;
    }

    public NotificationMessageBank(Integer notificationMessageBankId, String notificationTitle, String notificationMessage) {
        this.notificationMessageBankId = notificationMessageBankId;
        this.notificationTitle = notificationTitle;
        this.notificationMessage = notificationMessage;
    }

    public Integer getNotificationMessageBankId() {
        return notificationMessageBankId;
    }

    public void setNotificationMessageBankId(Integer notificationMessageBankId) {
        this.notificationMessageBankId = notificationMessageBankId;
    }

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    public String getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    public NotificationColor getNotificationColorId() {
        return notificationColorId;
    }

    public void setNotificationColorId(NotificationColor notificationColorId) {
        this.notificationColorId = notificationColorId;
    }

}
