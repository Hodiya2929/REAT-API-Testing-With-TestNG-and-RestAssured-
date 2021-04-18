package utils;

import errors.NoSuchEndpointException;

public class UrlFactory {

	public final static String baseUrl = "http://localhost:8080/api/v1/"; 

	/**
	 * This method returns the full REST URL that is tested.
	 * The function doesn't handle the arguments inside (e.g - http://localhost:8080/api/v1/connections?host_id=host-123abd)
	 * See - class/method
	 * @param endpoint - the endpoint that we want to test
	 * @return the full REST URL endpoint 
	 * @throws NoSuchEndpointException - in case the endpoint in not exist
	 */
	public static String getFullUrlFactory(Endpoints endpoint) throws NoSuchEndpointException
	{
		switch (endpoint) {
		
		case CONNECTIONS:
			return baseUrl + "connections";
			
		case STATISTICS:
			return baseUrl + "statistics";

		default:
			throw new NoSuchEndpointException(baseUrl + endpoint.name() + " is not exist!");
		}

	}

}
