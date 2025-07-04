package CoreJava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int original = num;
		int rev=0;
		int count=0;
		
		while(num!=0) {
			int digit= num%10;//get last digit
			rev= rev*10 +digit; //Build rev number
			num= num/10; //remove last digit
			
			count++; //increment count
		}
		System.out.println("count is: "+ count);
		System.out.println("Rev number is: "+ rev);
		if(original == rev) {
			System.out.println("the entered number is Palindrome" + rev);
		}
		else {
			System.out.println("Not palindrome number");
		}
	}

}
