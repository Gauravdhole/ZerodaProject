package Program1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import  static org.hamcrest.Matchers.*;

import files.Payload;

public class Prog1 {

	public static void main(String[] args) {
		
		//add plcaed updated placed with  new address->get plae if valiaded if new  address present 
		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String Response = given().log().all().queryParam("key ", "qaclick123")
				.header("Content-Type", "application/json").body(Payload.AddPlaced()).when()
				.post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).header("Server", "Apache/2.4.41 (Ubuntu)").extract().response()
				.asString();

		System.out.println(Response);

		JsonPath jd = new JsonPath(Response);
		String placedId = jd.getString("place_id");
		System.out.println(placedId);
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\""+placedId+"\",\r\n"
				+ "\"address\":\"70 Summer walk, USA\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "").
		when().put(" /maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200);
		
		
		
		
	}
	
}
