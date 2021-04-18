package functional.tests.connections;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import environment.structure.Environment;
import environment.structure.Host;
import errors.NoSuchEndpointException;

import static org.hamcrest.Matchers.*;

import java.net.URISyntaxException;
import java.util.List;

import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;
import utils.*;

public class NegativeStatusCode {

	Endpoints connections = Endpoints.CONNECTIONS;

	/**
	 * Test that non-exist hosts returns 404 status code
	 * 
	 * @throws NoSuchEndpointException
	 * @throws URISyntaxException
	 */
	@Test
	public void connectionsPositiveStatusCode() throws NoSuchEndpointException, URISyntaxException {
		
		String connectionsUrl = UrlFactory.getFullUrlFactory(connections);

		for (int i = 1; i <= 10; i++) {
			String randomString = "host-"+utils.TestUtils.randomStrings(6).toLowerCase();
			
			io.restassured.RestAssured.given().param("host_id", randomString).when().get(connectionsUrl).then()
					.statusCode(404);
		}

	}

}