package stepDefinations;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Location;
import resources.TestDataBuild;
import resources.Utils;

public class Stepdefinitionfile extends Utils  {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data=new TestDataBuild();
	@Given("Add Place Payload")
	public void add_place_payload() throws FileNotFoundException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
	 
	 res=given().spec(requestSprecification()).body(data.add_Place_Payload());
	}

	@When("user calls {string} with Post http request")
	public void user_calls_with_post_http_request(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		resspec=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response=res.when().post("/maps/api/place/add/json").
				then().spec(resspec).extract().response();
	}

	@Then("the API call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	assertEquals(response.getStatusCode(),200);
		
	}

	

	@Then("{string} is response body is {string}")
	public void is_response_body_is(String keyValue, String Expectedvalue) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		String resp=response.asString();
		JsonPath js=new JsonPath(resp);
assertEquals(js.get(keyValue).toString(),Expectedvalue);
		
		
	}
}
