package Api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.Payload;
public class Basic {
public static void main(String[] args) {
	
	
	// add place and updated placed with new address ->get placed to valiadtes if the new address is presents in responsed
		// static pakages is  
		//equalTo  hamrcrust pakeges;
	
	// given - all input details
	//when - sumit the api = resoces 
	//then- validate the responsed
	
	RestAssured.baseURI="https://rahulshettyacademy.com";
	
	 String resopnce = given().log().all().queryParam("key ", "qaclick123").header("content-Type","application/json")//inputHeader
	.body(Payload.AddPlaced()).when().post("/maps/api/place/add/json")
	            .then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
	            .header("server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();
	
	
	System.out.println(resopnce);
	
	JsonPath js = new JsonPath(resopnce);//passing jsons
	
	String placed = js.getString("place_id");
	System.out.println(placed);
	
	String NewAddress="africa wai";
	given().log().all().queryParam("key ", "qaclick123")
	.header("content-Type","application/json")
	.body("{\r\n"
			+ "\"place_id\":\""+placed+"\",\r\n"
			+ "\"address\":\""+NewAddress+"\",\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "}\r\n"
			+ "").
	when().put("/maps/api/place/update/json")
	.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));

  String GetPlacedId = given().log().all().queryParam("key", "qaclick123")
    .queryParam("place_id", "placed")
    .when().get("/maps/api/place/get/json")
    .then().assertThat().log().all().statusCode(200).extract().response().asString();
  
  
	JsonPath jl1 = new JsonPath(GetPlacedId);
	String actaulAdress = jl1.getString("address");
	System.out.println(actaulAdress);
	
	

}
	
	
}
