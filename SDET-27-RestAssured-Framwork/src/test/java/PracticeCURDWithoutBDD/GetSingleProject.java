package PracticeCURDWithoutBDD;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleProject {

	@Test
	public void getSingleProject()
	{
		//Step 1
		Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_004");
		
		//Step 2
		System.out.println(resp.prettyPeek());
	}
}
