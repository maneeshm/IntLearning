package stringAdd;

public class StringAddition {


	public static void main(String[] args) {

		char s1[] = {'1','0','1'};
		char s2[] = {'1','1','1','0'};
		
		System.out.println(addBinaryString(s1,s2));

		
		
	}

	private static char[] addBinaryString(char[] s1, char[] s2) {
 
		int oneIndex = s1.length -1;
		int twoIndex = s2.length - 1;
		char s3[] = new char[Math.max(oneIndex, twoIndex) + 1];
		boolean carry = false;
		int i = 0;
		
		while (oneIndex == 0 || twoIndex == 0){
			if (s1[oneIndex] == '1' && s2[twoIndex] == '1'){
				if(carry)
					s3[i++] = '1';
				else 
					s3[i++] = '0';
				carry = true;
			}else
				;
			
		}
		
		return null;
	}

}
