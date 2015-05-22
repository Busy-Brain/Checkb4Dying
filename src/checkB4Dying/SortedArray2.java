/**
 * Testing arrays after sort
 */
package checkB4Dying;

import java.util.Arrays;
import java.util.Random;

public class SortedArray2 {

	public static void main(String[] args) { // Generate data
        int arraySize = 99999;
        int data[] = new int[arraySize];

        Random rnd = new Random(0);
        for (int c = 0; c < arraySize; ++c)
            data[c] = rnd.nextInt() % 256;
        
        test(arraySize, data);
      
        testSort(arraySize, data);
	}
	private static void test(int arraySize, int[] data) {
		long start = System.nanoTime();

		System.out.println("sum = " + loopThroughArray(arraySize, data));
		System.out.println((System.nanoTime() - start) / 1000000000.0);
		
	}
	private static long loopThroughArray(int arraySize, int[] data) {
		long sum=0;
		for (int i = 0; i < 100000; ++i) {
			// Primary loop
			for (int c = 0; c < arraySize; ++c) {
				if (data[c] >= 128)
					sum += data[c];
			}
		}
		return sum;
	}
	private static void testSort(int arraySize, int[] data) {
		long start = System.nanoTime();
		  Arrays.sort(data);
		
		System.out.println("sum = " + loopThroughArray(arraySize, data));
		System.out.println((System.nanoTime() - start) / 1000000000.0);
		
	}
	
}
