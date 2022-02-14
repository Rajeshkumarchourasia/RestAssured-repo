package GenericUtility;


import static io.restassured.RestAssured.*;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseAPI {
	
	public DataBaseUtility dLib = new DataBaseUtility();
	public JavaUtility jLib = new JavaUtility();
	public RestAssuredUtility rLib = new RestAssuredUtility();
	
	@BeforeSuite
	public void bsConfig() throws Throwable 
	{
		baseURI = "http://localhost";
		port = 8084;
		
		dLib.connectToDB();
		System.out.println("=====database connection established");
	}
	
	@AfterSuite
	public void asConfig() throws Throwable 
	{
		dLib.closeDb();
		System.out.println("=======database connection closed=======");
	}
}
