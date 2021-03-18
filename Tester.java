
public class Tester {
	static boolean bugPresent;
	private int buildVersion;
	private String synosis;
	private SEVERITY severity;

	public Tester(int buildVersion, String synosis, SEVERITY severity) {

		this.buildVersion = buildVersion;
		this.synosis = synosis;
		this.severity = severity;
	}
	public static void testBug() {
		System.out.println("Initiated testing");
		bugPresent = true;
		TYPE type = TYPE.RUNTIME;
		System.out.println("Bug detected: "+type);
		//Bug bug= new Bug("bg0123", "abcdbug");
		//sendBugReport();
	}

	public static void sendBugReport() {
		System.out.println("Mail successfully sent to manager.");
	}
	
	public static void retest() {
		System.out.println("Retesting initiated");
		STATUS bugStatus2 = STATUS.FIXED;
		System.out.println("The bugstatus changed by tester to: "+ bugStatus2);
	}

}
