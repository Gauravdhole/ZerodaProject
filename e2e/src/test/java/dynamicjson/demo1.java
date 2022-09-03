package dynamicjson;

import org.testng.annotations.Test;

import files2Dyamnic.payLoad1d;
import io.restassured.RestAssured;
import static  io.restassured.RestAssured.*;

public class demo1 {

	@Test
	public void addBooks() {
		
		RestAssured.baseURI="http://216.10.245.166";
		
		//given is static you will import pakage manully
		//post request you have header  beaces you  will  send the what types of body
		
		
		
		
	String	respons =given().header("Content-Types","application /json").
		body(payLoad1d.AddBooks()).
		when()
		.post("Library/Addbook.php")
		.then().assertThat().statusCode(200)
		.extract().response().asString();
	
		
		
				
				
				
				
	}
}
