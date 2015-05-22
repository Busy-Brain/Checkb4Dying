/**
 * why to use primitives when they are not Object Oriented?
 */
package checkB4Dying;

public class TheWrapperClass {

	public static void main(String[] args) {
		useLong();
		uselong();

	}

	private static void useLong() {
		long start=System.currentTimeMillis();
		 Long sum = 0L; 
		    for(long i = 0; i <= Integer.MAX_VALUE; i++) {
		        sum += i;
		    }
		    System.out.println(sum);
		    System.out.println(System.currentTimeMillis()-start);
	}
	private static void uselong() {
		long start=System.currentTimeMillis();
		 long sum = 0L; 
		    for(long i = 0; i <= Integer.MAX_VALUE; i++) {
		        sum += i;
		    }
		    System.out.println(sum);
		    System.out.println(System.currentTimeMillis()-start);
	}

}
//http://stackoverflow.com/questions/5199359/why-do-people-still-use-primitive-types-in-java