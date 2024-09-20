package UserExceptions;

public class PasswordTooLong extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;

	public PasswordTooLong() {
		message = "Password too long";
	}

	public PasswordTooLong(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n" + message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return  "\n" + message;
	}

}
