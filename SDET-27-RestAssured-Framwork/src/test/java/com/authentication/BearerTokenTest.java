package com.authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BearerTokenTest {
	@Test
	public void bearerAuth() {
		given()
			.auth().oauth2("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")
		.when()
			.get("https://api.github.com/user/repos")
		.then()
			.assertThat().statusCode(200)
			.log().all();
	}
}
