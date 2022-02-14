package com.rmgyantra.Test;

import GenericUtility.BaseAPI;
import GenericUtility.EndPoints;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PojoLibrary.PojoClass;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class UpdateResourceAndVerifyInDtabase extends BaseAPI {
	
	@Test
	public void updateResourceAndVerifyInDb() throws Throwable {
		
		
		//String proId = "TY_PROJ_008";
		PojoClass pojo = new PojoClass("deepak", "india", "Completed", 100);
		Response resp = given()
				.body(pojo)
				.contentType(ContentType.JSON)
				
			.when()
				.put(EndPoints.updateProjects+"/TY_PROJ_004");
		
		
		String expData = rLib.getJSONData(resp, "createdBy");
		System.out.println(expData);
	
		String query = "select * from project;";
		String actData = dLib.executeQueryAndGetData(query, 2, expData);
		Reporter.log(actData,true);
		
		Assert.assertEquals(expData, actData);
		Reporter.log("data verification succesfull", true);
		
	}

}
