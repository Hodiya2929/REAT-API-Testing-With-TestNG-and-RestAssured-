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

public class PositiveStatusCode {

	Endpoints connections = Endpoints.CONNECTIONS;

	/**
	 * Short test to validate that all hosts in the environment have 200 status code
	 * 
	 * @throws NoSuchEndpointException
	 * @throws URISyntaxException
	 */
	@Test
	@Parameters("environment")
	public void connectionsPositiveStatusCode(String environment) throws NoSuchEndpointException, URISyntaxException {
		String connectionsUrl = UrlFactory.getFullUrlFactory(connections);

		Environment env = EnvironmentFactory.getEnvironment(environment);

		List<Host> allHostsInEnvironment = env.getHosts();

		for (Host host : allHostsInEnvironment) {
			io.restassured.RestAssured.given().param("host_id", host.getHostId()).when().get(connectionsUrl).then()
					.statusCode(200);
		}

	}

}
