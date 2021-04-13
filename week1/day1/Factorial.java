package week1.day1;

import java.util.Scanner;

public class Factorial {

public static void main(String[] args) {
		// TODO Auto-generated method stub
//factorial of 5
		
/*int input =5;
int fact =1;
	      for(int i=1;i<=input;i++) {
	      	fact= fact*i;
	      	
	      }
	      System.out.println(fact);*/ 
		
//----to get the input from console use scanner class---//

		Scanner scan= new Scanner(System.in);
		System.out.println("enter the number for factorial calculation");
		int input= scan.nextInt();
        int fact =1;
for(int i=1;i<=input;i++) {
	fact= fact*i;
	
}
System.out.println(fact);
	}

}
