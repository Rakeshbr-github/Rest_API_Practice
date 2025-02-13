package Swiggy_package;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
public class User_details {

	public static void main(String[] args) {
		
		RestAssured.baseURI=("https://reqres.in");
////		user creation with valid details
		String response1=
				given().
				       log().all().
				       body(payloads.createuser())
				.when().
					   post("/api/users")
		        .then().
		               log().all().
		               assertThat().statusCode(201).extract().response().toString();
		
		
////		user creation with invalid details
//		String response2=
//				given().
//				       log().all().body(payloads.createuserinvalid())
//		        .when().
//		               post("/api/users")
//		        .then().
//		               log().all().
//		               assertThat().statusCode(400).extract().response().toString();
		
		
System.out.println("##################first API execution completed###################################");
System.out.println();
//		Assert the list contains unique ID's and valis Emailid
		       String response3=given().
		               log().all()
                .when()
                       .get("api/users")
                .then()
                       .log().all()
                       .assertThat().statusCode(200).extract().response().toString();

System.out.println("##################Second API execution completed###################################");
System.out.println();

//To update user details
       given().
               log().all().body("{\r\n"
               		+ "    \"id\": \"Rakesh\",\r\n"
               		+ "    \"email\": \"raklearnign@1.in\"\r\n"
               		+ "}");
        when().
              put("/api/users/1")
        .then().log().all().assertThat().statusCode(200).extract().response();
        

System.out.println("##################Third API execution completed###################################");
System.out.println();        
        
      //To update user details
        given().
                log().all().body("{\r\n"
                		+ "    \"id\": \"Rakesh\"}");
         when().
               delete("/api/users/1")
         .then().log().all().assertThat().statusCode(204).extract().response();
         
System.out.println("##################Fourth API execution completed###################################");
System.out.println();        
		        
		        
	}

}
