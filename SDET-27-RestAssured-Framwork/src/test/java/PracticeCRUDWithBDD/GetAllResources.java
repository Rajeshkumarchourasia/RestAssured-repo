package PracticeCRUDWithBDD;

import static  io.restassured.RestAssured.*;

import org.junit.Test;

import io.restassured.http.ContentType;


public class GetAllResources {
	@Test
	public void GetAllResources()
	{
			when()
				.get("http://localhost:8084/projects")
			.then()
				.assertThat().contentType(ContentType.JSON)
				.statusCode(200)
				.log().all();
	}

}
