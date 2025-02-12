package Swiggy_package;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
public class User_details {

	public static void main(String[] args) {
		
		RestAssured.baseURI=("https://reqres.in");
//		user creation with valid details
		String response1=given().log().all().body(payloads.createuser())
		.when().post("/api/users")
		.then().log().all().assertThat().statusCode(201).extract().response().toString();
		
		
//		user creation with invalid details
		
		String response2=given().log().all().body(payloads.createuserinvalid())
		.when().post("/api/users")
		.then().log().all().assertThat().statusCode(400).extract().response().toString();
		

	}

}
