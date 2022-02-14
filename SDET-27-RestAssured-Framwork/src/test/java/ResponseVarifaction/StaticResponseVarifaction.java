package ResponseVarifaction;



import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StaticResponseVarifaction {
	@Test
	public void verify()
	{
		String expectedProjectName="postman";
		 Response responce=when()
			.get("http://localhost:8084/projects");
		String actualProjectName=responce.jsonPath().get("[0].projectName");
		
		responce.then()
				.assertThat()
				.contentType(ContentType.JSON).and().statusCode(200)
				.log().all();
		
		Assert.assertEquals(expectedProjectName,actualProjectName);
	}

}
