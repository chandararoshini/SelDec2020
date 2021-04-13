package week1Assignment;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={4,6,4,2,9,2,8,10};
		boolean isDuplicateExist = false;
		Set<Integer> uniquelist = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(uniquelist.contains(arr[i])) {
				isDuplicateExist =true;
			}
			else {
				uniquelist.add(arr[i]);
				
			}
		}
		System.out.println(uniquelist);	
	}

}
