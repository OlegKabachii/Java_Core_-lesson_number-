package homework_1;

public class WrongInputConsoleParametersException extends Exception {
private String message;
	
	public String getMessage() {
	return message;
}

	public WrongInputConsoleParametersException(String message) {
		super(message);
		this.message = message;
	}
}
