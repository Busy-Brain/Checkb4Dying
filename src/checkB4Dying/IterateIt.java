/**
 * What to use while traversing ArrayLists, iterator or Loops?
 */
package checkB4Dying;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateIt {
	private static final int LIST_SIZE=9999999;
	public static void main(String[] args) {
		useIterator(getList());
		useLoop(getList());
	}
	private static void useLoop(List<Integer> l2) {
		long startTime2= System.currentTimeMillis();
		int size=l2.size();
		int sum2=0;
		for(int i=0;i<size;i++){
			sum2=sum2+l2.get(i);
		}
		long time2=System.currentTimeMillis()-startTime2;
		
		
		System.out.println(time2+ "  " +sum2);
	}
	private static void useIterator(List<Integer> l1) {
		long startTime1= System.currentTimeMillis();
		Iterator<Integer> it = l1.iterator();
		int sum1=0;
		while (it.hasNext()){
			
			sum1=sum1+it.next();
		}
	long time1=System.currentTimeMillis()-startTime1;
	System.out.println(time1+ "  " +sum1);
	}
	private static List<Integer> getList(){
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<LIST_SIZE;i++){
			list.add(i);
		}
		
		return list;
		
	}
}
