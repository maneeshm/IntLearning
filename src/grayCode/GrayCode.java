package grayCode;

public class GrayCode {

	/**
	 * @param args
	 */
	static char charArray[] = {'0','0','0','0'};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grayCode(4);
	}

	static void grayCode(int i){
		
		if (i == 1){
			System.out.println(charArray);
			charArray[0] = (charArray[0] == '0'?'1':'0');
			System.out.println(charArray);
			return;
		}
		
		grayCode(i-1);
		charArray[i-1] = (charArray[i-1] == '0'?'1':'0');
		grayCode(i-1);
	}
}
