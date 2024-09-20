package Exceptions;


public class InvalidCountryExceptions extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;

	public InvalidCountryExceptions() {
		message = "Only Indian Students Allowed";
	}

	public InvalidCountryExceptions(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
