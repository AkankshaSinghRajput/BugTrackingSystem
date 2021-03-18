
public class Employee {
	protected static String id;
	protected static String name;
	private String emailId;
	private int mobileNumber;

	public Employee(String id, String name, String emailId, int mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
