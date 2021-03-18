
public class Project {
	private String name;
	private TYPE type;
	private String projectId;
	private String managerId;
	private String testerId;
	private String developerId;

	public Project(String name, TYPE type, String projectId, String managerId, String testerId, String developerId) {
		this.name = name;
		this.type = type;
		this.projectId = projectId;
		this.managerId = managerId;
		this.testerId = testerId;
		this.developerId = developerId;
	}

	public void UpdateProject() {
		// TODO Auto-generated method stub

	}

	public void AddProject() {
		// TODO Auto-generated method stub

	}

	public void DeleteProject() {
		// TODO Auto-generated method stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getTesterId() {
		return testerId;
	}

	public void setTesterId(String testerId) {
		this.testerId = testerId;
	}

	public String getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(String developerId) {
		this.developerId = developerId;
	}

}
