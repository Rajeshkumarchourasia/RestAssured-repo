package Assignment;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class AddSingleProjectwithCreatedStatus {
	@Test
	public void createproject() {
		
		//Step 1:  create data
		JSONObject jobj =new JSONObject();//json simple dependency
		jobj.put("createdBy","rajesh");
		jobj.put("createdOn", "03/02/1994");
		//jobj.put("projectId", "string");
		jobj.put("projectName", "rajsh_pro-3");
		jobj.put("status", "Created");
		jobj.put("teamSize", 10);
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201)//.time(Matchers.lessThan(5000L), TimeUnit.MILLISECONDS)
		.contentType(ContentType.JSON)
		.log().all();
		
	
	}
}
