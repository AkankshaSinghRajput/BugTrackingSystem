import java.util.Date;

public class Developer extends Employee {

	public Developer(String id, String name, String emailId, int mobileNumber) {
		super(id, name, emailId, mobileNumber);
	}

	public static STATUS setBugStatus() {
		STATUS bugStatus = STATUS.OPEN;
		System.out.println("Bug Status set by developer is: " +bugStatus);
		System.out.println("Resolving bug..");
		SEVERITY severity= SEVERITY.MILD;
		System.out.println("Severity level is: "+severity);
		STATUS bugStatusnow = STATUS.PENDINGRETEST;
		System.out.println(bugStatusnow+"...");
		return bugStatusnow;

	}

	public static void assignBugTester() {
	}

	public static void acknowledgeTester() {
	}

}
