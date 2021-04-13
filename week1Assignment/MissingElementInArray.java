package week1Assignment;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,2,4,7,6,8,1,10,12};
		Arrays.sort(arr);
		int i=1;

        while ( i < arr.length ) 
        {
            if ( arr[i] - arr[i-1] == 1 ) 
            {
            } 
            else 
            {
                System.out.println( "Missing number is " + ( arr[i-1] + 1 ) );
            }
            i++;
        }

			}
		

}
