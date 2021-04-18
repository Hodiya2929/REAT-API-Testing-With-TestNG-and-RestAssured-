package errors;

public class NoSuchEndpointException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoSuchEndpointException(String message)
	{
		super(message);
	}

}
