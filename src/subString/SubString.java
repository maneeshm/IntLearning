package subString;

public class SubString {

	/**
	 * @param args
	 */
	static int arraySize[][] ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arrayOne[] = "ABCACD".toCharArray();
		char arrayTwo[] = "BCC".toCharArray();	
		
		arraySize = new int[arrayOne.length+1][arrayTwo.length+1];
		
		
		generateSubString(arrayOne, arrayTwo);
	}

	
	private static void generateSubString(char[] arrayOne, char[] arrayTwo) {
		
		for (int i = 0; i < arrayOne.length; i++){
			for (int j = 0; j < arrayTwo.length; j++) {
				
				if (arrayOne[i] == arrayTwo[j]){
					arraySize[i+1][j+1] = arraySize[i][j] + 1;
				}
				else {
					arraySize[i+1][j+1] = Math.max(arraySize[i][j+1], arraySize[i+1][j]);
				}
				
			}
		}
		
		
	}

}
