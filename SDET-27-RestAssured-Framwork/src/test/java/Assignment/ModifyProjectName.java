package Assignment;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class ModifyProjectName {
	@Test
	public void update()
	{
		//create of random number
				Random ran =new Random();
				int randomnumber = ran.nextInt(500);
				
				JSONObject jobj=new JSONObject();//json simple dependency
				jobj.put("createdBy","rajesh");
				jobj.put("createdOn", "03/02/1994");
				//jobj.put("projectId", "string");
				jobj.put("projectName", "rajesh_pro-99");
				jobj.put("status", "Created");
				jobj.put("teamSize", 10);
				
				given()
				.body(jobj)
				.contentType(ContentType.JSON)
				
				.when()
				.put("http://localhost:8084/projects/TY_PROJ_216")
				.then()
				.assertThat()
				.statusCode(200)
				.log().all();		
	}


	
}
