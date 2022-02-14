package PracticeCURDWithoutBDD;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {

@Test

public void updateProject()
{
	//Step 1:Create test Data
	JSONObject jObj = new JSONObject();
	jObj.put("createdBy","rajesh");
	jObj.put("projectName","rmg sdet");
	jObj.put("status", "Creted");
	jObj.put("teamSize", 12);
	
	//Step 2
	RequestSpecification req = RestAssured.given();
	req.contentType(ContentType.JSON);
	req.body(jObj);
	
	//Step 3
	
}
}
