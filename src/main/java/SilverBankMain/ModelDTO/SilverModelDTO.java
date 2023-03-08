package SilverBankMain.ModelDTO;

public class SilverModelDTO {
	
	private String silverPhoneNumber;
	private String silverEmail;
	private String silverFullName;
	private String silverTopic;
	private String silverMessage;
	
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
	
	public SilverModelDTO(String silverPhoneNumber, String silverEmail, String silverFullName, String silverTopic,
			String silverMessage) {
		super();
		this.silverPhoneNumber = silverPhoneNumber;
		this.silverEmail = silverEmail;
		this.silverFullName = silverFullName;
		this.silverTopic = silverTopic;
		this.silverMessage = silverMessage;
	}
	
	public SilverModelDTO() {
		super();
	}
}
