package SilverBankMain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SilverBankTable")
public class SilverModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Phone Number")
	private String silverPhoneNumber;
	
	@Column(name = "Email")
	private String silverEmail;
	
	@Column(name = "Full Name")
	private String silverFullName;
	
	@Column(name = "Topic")
	private String silverTopic;
	
	@Column(name = "Message")
	private String silverMessage;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSilverPhoneNumber() {
		return silverPhoneNumber;
	}

	public void setSilverPhoneNumber(String silverPhoneNumber) {
		this.silverPhoneNumber = silverPhoneNumber;
	}

	public String getSilverEmail() {
		return silverEmail;
	}

	public void setSilverEmail(String silverEmail) {
		this.silverEmail = silverEmail;
	}

	public String getSilverFullName() {
		return silverFullName;
	}

	public void setSilverFullName(String silverFullName) {
		this.silverFullName = silverFullName;
	}

	public String getSilverTopic() {
		return silverTopic;
	}

	public void setSilverTopic(String silverTopic) {
		this.silverTopic = silverTopic;
	}

	public String getSilverMessage() {
		return silverMessage;
	}

	public void setSilverMessage(String silverMessage) {
		this.silverMessage = silverMessage;
	}

}