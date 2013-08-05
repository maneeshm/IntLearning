package tue_7th;

public class Combinations {

	/**
	 * @param args
	 */
	static int global_sum=100;	///
	static int global_count[] = new int[5];   /////
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {1,5,10,25,50};
		int sum = 00;
		
		for (int i = 0; i < array.length; i++){
			makeGlobalCountZero();
			function(array, sum, i);
			sum=0;
			
		}
	}

	private static void makeGlobalCountZero() {
		// TODO Auto-generated method stub
		for (int i = 0; i < global_count.length; i++)
			global_count[i]=0;
	}

	private static void function(int[] array, int sum, int index) {
		// TODO Auto-generated method stub
		
		if ((sum) == 100) ////
			printGlobalCountArray(array);
		
		if (index >= array.length)
			return;
			
			
		if ((array[index] + sum) > 100){  /////
			global_count[index]=0;
			return;
		}

		
		for(int i = 1; i <= ((global_sum - sum)/array[index]);i++){
			global_count[index]=i;
			
			int temp = array[index] * i;
			
			function(array, sum + temp, index + 1);
		}
	}

	private static void printGlobalCountArray(int array[]) {
		System.out.print("Print ");
		for (int i = 0; i < global_count.length; i++){
			System.out.print(array[i] + " * " + global_count[i] + " + ");
		}
		System.out.println();
		
	}

}
