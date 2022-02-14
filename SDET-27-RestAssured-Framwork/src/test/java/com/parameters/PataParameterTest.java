package com.parameters;

import static  io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PataParameterTest {

		@Test	
		public void param() {
			String proId = "TY_PROJ_005";
			given()
				.pathParam("projectId", proId)
			.when()
				.delete("http://localhost:8084/projects/{projectId}")
			.then()
				.log().all();
				
			
		}
}
