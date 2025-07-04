package CoreJava;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int count= 0;
		int rev = 0;
		int num= sc.nextInt();
		while(num!=0) {
			int digit = num%10;// digit 123%10 = 3
			rev = rev *10 + digit; // 0*10+ 3 =3
			num = num /10;
			count++;
		}
		System.out.println("count is "+ count);
		System.out.println("Rev Number is: "+ rev);
		
	}

}
