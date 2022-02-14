package GenericUtility;
/**
 * this interface contains all the endpoints
 * @author user
 */
public interface EndPoints {

	String createProject = "/addProject";
	String getAllProjects = "/projects";
	String updateProjects = "/projects/{projectId}";
	String createEmployees = "/employees";
}
