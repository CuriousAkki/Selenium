package CoreJava;

import java.util.Arrays;

public class LargestValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,11,22,33,44,121,33,4,3};
		String s = "Akshay1234";
		int b = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] > b) {
				
				b = a[i];	
			}
		}
	
		System.out.println("Largest Element of the array is"+ b);
		System.out.println("length of array"+ a.length);
		System.out.println("Length of String is "+ s.length());
		//smallest element of the array
		for (int i=1; i<a.length; i++) {
			if(a[i]< b) {
				b = a[i];
			}
		}
		System.out.println("Smallest Element of the array is"+ b);
		
		//java 8 SE feature
		int max = Arrays.stream(a).max().getAsInt();
		System.out.println("Java 8 max val of array "+ max);
		
		int min = Arrays.stream(a).min().getAsInt();
		System.out.println("Java 8 min val of array "+ min);
		Arrays.sort(a);
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(a));
	}
}
