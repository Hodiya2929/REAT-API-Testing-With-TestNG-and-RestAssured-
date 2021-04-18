package functional.tests.statistics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import environment.structure.Environment;
import environment.structure.Host;
import errors.NoSuchEndpointException;

import java.net.URISyntaxException;
import java.util.List;

import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;
import utils.*;


public class NegativeStatusCode {


	Endpoints statistics = Endpoints.STATISTICS;

	/**
	 * Short test to validate that bad call return the right status call
	 * @throws NoSuchEndpointException
	 * @throws URISyntaxException
	 */
	@Test
	public void negativeStatusCode() throws NoSuchEndpointException, URISyntaxException {

		String statisticsUrl = UrlFactory.getFullUrlFactory(statistics);
		
		//check that the call - http://localhost:8080/api/v1/statistic result in 404 status code 
		statisticsUrl = statisticsUrl.substring(0, statisticsUrl.length()-2);

		io.restassured.RestAssured.given().when().get(statisticsUrl).then()
		.statusCode(404);

	}

}
