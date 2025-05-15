package CoreJava;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		a[0] = 11;
		a[1] = 22;
		a[2] = 2;
		a[3] = 44;
		a[4] = 5;
		
		System.out.println(a[0]);
		System.out.println("Printing Array in a loop");
		for(int i= 0; i<a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		String [] s = {"Akshay", "Virat", "Rohit", "Shikhar"};
		
		for(String j: s) {
			System.out.println(j);
		}

		
	}

}
