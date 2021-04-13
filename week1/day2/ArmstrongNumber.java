package week1.day2;

import java.util.Scanner;

public class ArmstrongNumber {

	private static Scanner scan;

	public static void main(String[] args) {
		System.out.println("given number is");
		scan = new Scanner(System.in);
		int input = scan.nextInt();
		int temp =input;
		int digcount =0;
		int rem;
		double sum=0;
		while(temp!=0) {
			digcount=digcount+1;
			temp = temp/10;
		
		}
		
		System.out.println(digcount);
		temp=input;
		while(temp>0) {
			rem=temp%10;
			sum=sum+Math.pow(rem, digcount);
			temp = temp/10;
		}
		System.out.println(sum);
		if(input==sum) {
		System.out.println("given number is armstrong");
		}else {
			System.out.println("not a armstrong number");
		}
	}
}


