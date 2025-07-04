package CoreJava;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String s = sc.nextLine();
		
		System.out.println("Enter your age");
		int a = sc.nextInt();
		
		System.out.println("Entered name is: "+ s +" and entered age is: "+ a);
	}

}
