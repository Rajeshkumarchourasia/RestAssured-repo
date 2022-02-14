package DifferentWayToPostRequest;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateResourceUsingJsonObjectTest {
	@Test
	
	public void create() {
		//Create random number
		
		Random ran = new Random();
		int randomNumbar = ran.nextInt(500);
		
		JSONObject jObj = new JSONObject();//json simple object
		jObj.put("createBy","raja123" );
		jObj.put("projectName", "kumar"+randomNumbar);
		jObj.put("status", "created");
		jObj.put("teamSize", 325);
		
		given()
			.body(jObj)
			.contentType(ContentType.JSON)
		.when()
			.post("http://localhost:8084/addProject")
		.then()
			.assertThat().statusCode(201)
			.contentType(ContentType.JSON)
			.log().all();
		
	}
}
