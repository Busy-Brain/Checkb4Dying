/**
 * Should we sort data in arrays before processing them?
 */
package checkB4Dying;

import java.util.Arrays;
import java.util.Random;

public class SortedArray {

	public static void main(String[] args) { // Generate data
        int arraySize = 32768;
        int data[] = new int[arraySize];

        Random rnd = new Random(0);
        for (int c = 0; c < arraySize; ++c)
            data[c] = rnd.nextInt() % 256;
        
       long timeTakenBeforeSort= test(arraySize, data);
        long curr=System.nanoTime();
        Arrays.sort(data);
        long timeTakenInSorting = System.nanoTime()-curr;
		System.out.println("Time taken in sorting"+timeTakenInSorting);
		long timeTakenAfterSort=test(arraySize, data);
		
		System.out.println("=============");
		System.out.println("TIME b4 sort   : "+timeTakenBeforeSort);
		System.out.println("TIME with sort : "+(timeTakenInSorting+timeTakenAfterSort));
		
		
	}
	private static long test(int arraySize, int[] data) {
		long start = System.nanoTime();
		long sum = 0;

		for (int i = 0; i < 100000; ++i) {
			// Primary loop
			for (int c = 0; c < arraySize; ++c) {
				if (data[c] >= 128)
					sum += data[c];
			}
		}
		long timetaken=System.nanoTime() - start;
		System.out.println(timetaken);
		System.out.println("sum = " + sum);
		return timetaken;
	}
	
}
