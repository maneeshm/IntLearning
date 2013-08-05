package Wed_5_29_2013;

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int inputArray[][] = {{1,0},{2,3},{3,4}};
		boolean colOutputArray[] = new boolean [inputArray[0].length];
		boolean rowOutputArray[] = new boolean [inputArray.length];
		
		for (int i = 0; i < inputArray.length; i++){
			for (int j = 0; j < inputArray[0].length; j++){
				if (inputArray[i][j] == 0){
					colOutputArray[j] = true;
					rowOutputArray[i] = true;
				}
			}
		}
		
		for (int i = 0; i < inputArray.length; i++){
			for (int j = 0; j < inputArray[0].length; j++){
				if ( colOutputArray[j] || rowOutputArray[i]){
					inputArray[i][j] = 0;
				}
					
			}
		}
		
		for (int i = 0; i < inputArray.length; i++){
			for (int j = 0; j < inputArray[0].length; j++){
				System.out.print(" " + inputArray[i][j]);
			}
			System.out.println();
		}
		
	}

}
