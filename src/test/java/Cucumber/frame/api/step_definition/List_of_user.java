package Cucumber.frame.api.step_definition;
import Cucumber.frame.api.generic.Endpoint;
import Cucumber.frame.api.generic.Spec_builder_Api;
import io.cucumber.java.en.*;
import static io.restassured.RestAssured.*;
import org.junit.Assert;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class List_of_user 
{
	public static RequestSpecification req;
	private Response res;
	@Given("user enters the base uri")
	public void user_enters_the_base_uri()
	{
		 req = Spec_builder_Api.Request_spec_builder();
    }
	
	@When("user calls {string} Endpoint with GET HTTP request")
	public void user_calls_endpoint_with_get_http_request(String end) 
	{
			Endpoint a1 = Endpoint.valueOf(end);
		  res = given().spec(req).when().get(a1.get_end());
	}
	
	@Then("use should get the response")
	public void use_should_get_the_response() 
    {
    	System.out.println(res.asString());
    }

	@Then("user should get the status code as {int}")
	public void user_should_get_the_status_code_as(int status_code) 
    {
    	Assert.assertEquals(status_code, res.getStatusCode());
    }
}
