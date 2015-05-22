package exceptions;
public class ExceptionCaching {

	private static final int NUMBER_OF_ITERATIONS = 100000;
	public static void main(String args[]) {
		throwCachedException();
		throwNewException();
	}

	private static void throwCachedException() {
		long initialTime = System.currentTimeMillis();
		Exception e = new Exception();
		for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
			try {
				throw e;
			} catch (Exception f) {

			}
		}
		System.out.println("Total time during cached exception : "+(System.currentTimeMillis()-initialTime)+ "ms");
	}
	private static void throwNewException() {
		long initialTime = System.currentTimeMillis();
		
		for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
			try {
				throw new Exception();
			} catch (Exception f) {

			}
		}
		System.out.println("Total time during New exception : "+(System.currentTimeMillis()-initialTime)+ "ms");
	}
}
