public class BugTracking {
	public static boolean bugPresent=true;
	public static void main(String[] args) {
		Tester.testBug();
		Tester.sendBugReport();
		if(bugPresent==true) {
			Manager.assignBug();
		}
		else {
			System.out.println("Bug Resolved");
		}
	}
}
