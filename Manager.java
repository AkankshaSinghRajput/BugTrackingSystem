
public class Manager extends Employee {
	public Manager(String id, String name, String emailId, int mobileNumber) {
		super(id, name, emailId, mobileNumber);
	}

	public static void assignBug() {
		System.out.println("Assigning bug to a developer to fix.");
		Developer developer= new Developer("A134bn", "Shyam", "ffx@gmail.com", 33428);
		System.out.println("Assigned: "+ name +" with id "+ id);
		Developer.setBugStatus();
		Tester.retest();
	}

	public static void feedback() {
		//toDo
	}
}
