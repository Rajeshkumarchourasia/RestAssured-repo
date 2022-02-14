package Assignment;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateProjectAndAllocateUser {

		@Test
		public void createProject()
		{
			JSONObject jobj = new JSONObject();
			jobj.put("createdBy","rajesh");
			jobj.put("projectName", "jio");
			jobj.put("status", "Completed");
			jobj.put("teamSize", 12);
			
			//Step 2: provide Request Specification
			Response resp = given()
			.body(jobj)
			.contentType(ContentType.JSON)
			
			.when()
			.post("http://localhost:8084/addProject");
			
			resp.then()
			.assertThat().statusCode(201)
			.contentType(ContentType.JSON)
			.log().all();
			
			String proName=resp.jsonPath().get("projectName");
			
			JSONObject jobj1 = new JSONObject();
			jobj1.put("designation","SDET");
			jobj1.put("dob","03/02/1994");
			jobj1.put("email","rajeshchourasia1994@gmail.com");
			jobj1.put("empName","rajesh");
			jobj1.put("experience","4");
			jobj1.put("mobileNo","7992404964");
			jobj1.put("project",proName);
			jobj1.put("role","SOFTWARE ENGINEER");
			jobj1.put("username","Bharti");

			given()
			.body(jobj1)
			.contentType(ContentType.JSON)
			.when().post("http://localhost:8084/employees")
			.then()
			.assertThat()
			.contentType(ContentType.JSON)
			.log().all();
			
			
		}
}
