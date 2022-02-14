package com.authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Auth2 {
	@Test
	public void auths() {
		
		 Response response = given()
		 	.formParams("client_id","Sdet27")
		 	.formParams("client_secret", "19b8e9ff5ae08a72eb2a943882cc7eca")
		 	.formParams("grant_type", "client_credentials")
		 	.formParams("redirect_url", "https://example.com")
		 .when()
		 	.post("http://coop.apps.symfonycasts.com/token");
		 String token=response.jsonPath().get("access_token");
		 
		 given()
		 	.auth().oauth2(token)
		 	.pathParam("USER_ID", "2785")
		 .when()
		 	.post("http://coop.apps.symfonycasts.com/api{USER_ID}/eggs.count")
		 .then()
		 	.log().all();
		 
	}
}
