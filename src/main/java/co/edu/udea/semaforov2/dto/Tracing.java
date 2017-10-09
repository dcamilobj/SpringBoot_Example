/**
 * 
 */
package co.edu.udea.semaforov2.dto;

import java.util.Date;

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
@Table(name="Tracing")
public class Tracing{

	@Id
	@Column(name="tracing_id")
	private int tracingId;
	
	@JoinColumn(name="user_id", referencedColumnName="user_id")
	@ManyToOne(optional=false)
	private User userId;
	
	@Column(name="table_name")
	private String tableName;
	
	@Column(name="table_register_id")
	private int tableRegisterId;
	
	@Column(name="action")
	private String action;
	
	@Column(name="action_date")
	private Date actionDate;
	
	@Column(name="action_details")
	private String actionDetails;

	/**
	 * @return the tracingId
	 */
	public int getTracingId() {
		return tracingId;
	}

	/**
	 * @param tracingId the tracingId to set
	 */
	public void setTracingId(int tracingId) {
		this.tracingId = tracingId;
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
	 * @return the tableName
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * @param tableName the tableName to set
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * @return the tableRegisterId
	 */
	public int getTableRegisterId() {
		return tableRegisterId;
	}

	/**
	 * @param tableRegisterId the tableRegisterId to set
	 */
	public void setTableRegisterId(int tableRegisterId) {
		this.tableRegisterId = tableRegisterId;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return the actionDate
	 */
	public Date getActionDate() {
		return actionDate;
	}

	/**
	 * @param actionDate the actionDate to set
	 */
	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

	/**
	 * @return the actionDetails
	 */
	public String getActionDetails() {
		return actionDetails;
	}

	/**
	 * @param actionDetails the actionDetails to set
	 */
	public void setActionDetails(String actionDetails) {
		this.actionDetails = actionDetails;
	}
	
	
	
}
