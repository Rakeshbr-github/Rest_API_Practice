package Swiggy_package;

import io.restassured.path.json.JsonPath;

public class payloads {
	
	public static String createuser()
	{
		return "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
	}
	
	public static String createuserinvalid()
	{
		return "{\r\n"
				+ "  \"name\": \"77777\",\r\n"
				+ "  \"job\": \"77777\"\r\n"
				+ "}";
	}
	
     public static JsonPath rawJson(String response3)   //not using this anywhere currently
     {
    	 JsonPath js=new JsonPath(response3);
    	 return js;
     }

}
