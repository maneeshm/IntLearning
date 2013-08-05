package commonElements;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {

	
	public static void main(String[] args) {

		int s1[] = {1,2,3,4,5,6};
		int s2[] = {5,6,7,8};
		int s3[] = printCommonElements(s1, s2);
		
		for (int i =0; i<s3.length; i++){
			System.out.print(" " + s3[i]);
		}
		System.out.println();
	}

	private static int[] printCommonElements(int[] s1, int[] s2) {

		int s1pointer = 0;
		int s2pointer = 0;
		List<Integer> s3 = new ArrayList<Integer>();
		
		for(int i = 0; s1pointer < s1.length && s2pointer < s2.length; i++){
			if(s1[s1pointer] == s2[s2pointer]){
				s1pointer++;
				s2pointer++;
				s3.add(s2[s1pointer]);
			}else 
				if(s1[s1pointer] < s2[s2pointer]){
					s1pointer++;
				}
		}
		return convertInttoint(s3);
	}

	private static int[] convertInttoint(List<Integer> s3) {
		int s3Array [] = new int[s3.size()];
		int j = 0;
		for(Integer i : s3){
			s3Array[j++] = i;
		}
		return s3Array;
	}

}
