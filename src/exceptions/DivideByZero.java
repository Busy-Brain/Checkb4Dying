package exceptions;

import java.util.Random;
/**
 * Exception handeling vs condition check
 * 
 * We are creating an array of divisors which include some 0s.
 * We divide a number by all those numbers (while skipping 0s)
 * We do it in two different ways
 * 1) if condition
 * 2) try-catch block
 * 
 *  
 * @author mohit
 *
 */
public class DivideByZero {
	
	private static final int val = 100;
	private static final int ARRAY_SIZE=10000;
	private static final int[] divisiors = getDivisiors(ARRAY_SIZE);
	public static void main(String[] args) {
		
		usingIfCheck();
		usingTryCatch();
	}
	/**
	 * Returns an array of given size initilized with random values (0-10)
	 * @return
	 */
	private static int[] getDivisiors(int size) {
		Random randomGenerator = new Random();
		int[] a= new int[size];
		System.out.println("===================================");
		for(int i=0;i<a.length; i++){
			a[i]=randomGenerator.nextInt(10);
			System.out.print(a[i]+",");
		}
		System.out.println("\n===================================");
		return a;
	}
	/**
	 * using if-> an extra condition is checked everytime
	 */
	private static void usingIfCheck() {
		long curr=System.currentTimeMillis();
		for (int i = 0; i < divisiors.length; i++) {
			if(divisiors[i]!=0){
				int j=val/divisiors[i];
			}
		}
		System.out.println("Using If check  : "+(System.currentTimeMillis()-curr)+" ms");
	}
	/**
	 * using try-catch ->catch block is executed only when required
	 */
	private static void usingTryCatch() {
		long curr=System.currentTimeMillis();
		for (int i = 0; i < divisiors.length; i++) {
			try{
				int j=val/divisiors[i];
			}
			catch(java.lang.ArithmeticException e){
				
			}
			
		}
		System.out.println("Using try-catch : "+(System.currentTimeMillis()-curr) +" ms");
	}

}
