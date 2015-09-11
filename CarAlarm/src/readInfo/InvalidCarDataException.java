package readInfo;

public class InvalidCarDataException extends Exception {
	public InvalidCarDataException() {
		super();
	}

	public InvalidCarDataException(String message) {
		super(message);
	}

	public InvalidCarDataException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
