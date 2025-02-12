package Swiggy_package;

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
				+ "    \"name\": \""
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
	}
	

}
