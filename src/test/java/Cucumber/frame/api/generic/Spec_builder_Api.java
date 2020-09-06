package Cucumber.frame.api.generic;
import java.io.IOException;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
public class Spec_builder_Api 
{
	public static RequestSpecification Request_spec_builder()
	{
		RequestSpecBuilder req_bui = new RequestSpecBuilder();
		RequestSpecification req = req_bui.setBaseUri(Extract_properties.extract_properties("baseuri1")).
				setContentType(ContentType.JSON).build();
		return req;
	}
	
	public static ResponseSpecification Response_spec_builder(int statuscode, String statusline) 
	{
		ResponseSpecBuilder res_bui = new ResponseSpecBuilder();
		ResponseSpecification res = res_bui.expectContentType(ContentType.JSON).
				expectStatusCode(statuscode).expectStatusLine(statusline)
				.build();
		return res;
	}
}
