package Assignment;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetAlltheProjectIDAndValidateWRTDDataBase {
	@Test
	public void getallprojectid() {
		when()
		.get("http://localhost:8084/projects/TY_PROJ_203")
		
		.then()
		.assertThat().statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
	}
}

