package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num ={3,2,11,4,6,7};
		Arrays.sort(num);
		/*for (int i : num) {
			System.out.println(i);
		}*/
		System.out.println(num[num.length-2]);
	}

}
