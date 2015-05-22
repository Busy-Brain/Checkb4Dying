package exceptions;

public class OverridingException {

	private static final int NUMBER_OF_ITERATIONS = 100000;

	public static void main(String args[]) {
		throwException();
		throwCustomException();
	}

	private static void throwException() {
		long initialTime = System.currentTimeMillis();

		for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
			try {
				throw new Exception();
			} catch (Exception f) {

			}
		}
		System.out.println("Total time during  exception : "
				+ (System.currentTimeMillis() - initialTime) + "ms");
	}

	private static void throwCustomException() {
		long initialTime = System.currentTimeMillis();

		for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
			try {
				throw new CustomException();
			} catch (Exception f) {

			}
		}
		System.out.println("Total time during Custom exception : "
				+ (System.currentTimeMillis() - initialTime) + "ms");
	}

}

class CustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -800847216099861840L;

	@Override
	public synchronized Throwable fillInStackTrace() {

		return this;
	}

}
