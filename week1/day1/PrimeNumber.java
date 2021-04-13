package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 16;
		int count =0;
		for(int i=1;i<=input;i++) {
			if(input%i==0){
				count = count+1;
				}}
			if(count==2) {
				System.out.println("its a prime number");
			}
			if(count!=2) {
				System.out.println("not a prime number");
			}
			
		
	}
}
