package arrayTraverse;
/**
 * The problem of 2 D array.
 * 
 * Here we are initializing a 2 D array of arbitrary size. (For simplycity we have used a square 2 D array)
 * We are going to iterate the same array in two ways and analyse the outcome
 * 
 * The performance differs greatly  in both type of iterations
 * @author mohit
 *
 */
public class TheProblemOf2DArray {
	// Array size: bigger it is clearer is the difference in performance
private static final int ARR_SIZE=9999;
	public static void main(String[] args) {
		//new array
		int arr[][]=new int[ARR_SIZE][ARR_SIZE];
		
		long currTime=System.currentTimeMillis();
		rowFirst(arr);
		System.out.println("Total time in row : "+(System.currentTimeMillis()-currTime)+" ms");
		// new array, exactly similar to arr
		int arr1[][]=new int[ARR_SIZE][ARR_SIZE];
		currTime=System.currentTimeMillis();
		colFirst(arr1);
		System.out.println("Total time in col : "+(System.currentTimeMillis()-currTime) +" ms");
	}
	/**
	 * Here we are traversing in rows. (All colummns of a row to be completed before going to next row)
	 * @param arr
	 */
	private static void rowFirst(int arr[][]) {
		for(int i=0;i<ARR_SIZE;i++){
			for (int j=0;j<ARR_SIZE;j++){
				/*See this*/
				arr[i][j]=i+j;
			}
		}
		
	}
	/**
	 * Here we are traversing in columns. (All rows of a column to be completed before going to next column)
	 * @param arr
	 */
	private static void colFirst(int arr[][]) {
		
		for(int i=0;i<ARR_SIZE;i++){
			
			for (int j=0;j<ARR_SIZE;j++){
				/*See this*/
				arr[j][i]=i+j;
				
			}
		}
		
	}

}
