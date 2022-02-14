package PracticeCRUDWithBDD;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateResources {

	@Test
	public void create()
	{
		//create of random number;
		Random ran = new Random();
		int randomNumber = ran.nextInt(400);
		
		JSONObject jObj = new JSONObject();//json simple dependency
		jObj.put("createdBy","rajesh");
		jObj.put("projectName","rmg sdet");
		jObj.put("status", "Creted");
		jObj.put("teamSize", 15);
		
		given()
			.body(jObj)
			.contentType(ContentType.JSON)
		.when()
			.post("http://localhost;8084/addProject")
		.then()
			.assertThat().statusCode(201)
			.contentType(ContentType.JSON)
			.log().all();
			
	}
}
