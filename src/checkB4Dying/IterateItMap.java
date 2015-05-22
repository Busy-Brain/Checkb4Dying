/**
 * Does sorted values impact performance of Maps, (which by the way are unordered)
 */
package checkB4Dying;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class IterateItMap {
	private static final int SIZE=9999999;
	public static void main(String[] args) {
		final int[] dataset=getRandomValuesArray();
		storeAndRetrieveAllElements(new HashMap<Integer,Integer>(),"hashmap random",dataset);
		storeAndRetrieveAllElements(new TreeMap<Integer,Integer>(),"treemap random",dataset);
		final int[] sorted=getSortedValuesArray();
		storeAndRetrieveAllElements(new HashMap<Integer,Integer>(),"hashmap sorted",sorted);
		storeAndRetrieveAllElements(new TreeMap<Integer,Integer>(),"treemap sorted",sorted);
	}
	private static void storeAndRetrieveAllElements(Map<Integer,Integer> map,String name,final int[] dataset) {
		long curr= System.currentTimeMillis();
		
		for(int i=0;i<SIZE;i++){
			map.put(dataset[i], dataset[i]);
		}
		long putTime=System.currentTimeMillis()-curr;
		long curr2= System.currentTimeMillis();
		for(int i=0;i<SIZE;i++){
			map.get(dataset[i]);
		}
		long getTime=System.currentTimeMillis()-curr2;
		
		System.out.println("for "+name+" put time : "+putTime+" ms , get time : "+getTime+" ms , total time : "+(putTime+getTime)+" ms");
	}
	private static int[] getRandomValuesArray(){
		Random randomGenerator = new Random();
		int[] a = new int[SIZE];
		for(int i=0;i<SIZE;i++ ){
			a[i]=randomGenerator.nextInt(SIZE);
		}
		return a;
	}
	
	private static int[] getSortedValuesArray(){
		int[] a = new int[SIZE];
		for(int i=0;i<SIZE;i++ ){
			a[i]=i;
		}
		return a;
	}
	
}
