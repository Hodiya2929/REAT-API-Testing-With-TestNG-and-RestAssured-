package functional.tests.statistics;

import org.testng.annotations.Test;

import errors.NoSuchEndpointException;

import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import utils.*;

public class Responsecorrectness {

	Endpoints statistics = Endpoints.STATISTICS;


	/**
	 * Validating that the request number is correct
	 * 
	 * @throws NoSuchEndpointException
	 */
	@Test
	public void statisticsPositiveStatusCode() throws NoSuchEndpointException {
		
		String statisticsUrl = UrlFactory.getFullUrlFactory(statistics);

		Response response = 
				io.restassured.RestAssured.given().
				when().
				        get(statisticsUrl).
				then(). 
				extract().
				        response(); 

				int requestCount = response.path("request_count");
			
				
				for(int i = 1; i <= 50; i++)
				{
					io.restassured.RestAssured.given()
					
					.when().
					   get(statisticsUrl)
					   .then()
					   .assertThat()
					   .body("request_count", equalTo(++requestCount));
					
				}
	}
}