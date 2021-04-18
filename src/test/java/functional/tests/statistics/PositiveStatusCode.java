package functional.tests.statistics;

import org.testng.annotations.Test;

import errors.NoSuchEndpointException;

import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;
import utils.*;

public class PositiveStatusCode {

	Endpoints statistics = Endpoints.STATISTICS;
	Endpoints dv = Endpoints.CONNECTIONS;

	/**
	 * Short test to validate that the status call of statistics endpoint is 200
	 * 
	 * @throws NoSuchEndpointException
	 */
	@Test
	public void statisticsPositiveStatusCode() throws NoSuchEndpointException {
		String statisticsUrl = UrlFactory.getFullUrlFactory(statistics);

		io.restassured.RestAssured.given().when().get(statisticsUrl).then().statusCode(200);
	}
}
