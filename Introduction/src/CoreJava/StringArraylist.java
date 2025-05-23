package CoreJava;

import java.util.ArrayList;

public class StringArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Akshay");
		a.add("Mule");
		a.add("Cybage");
		a.add("Software");
		
		System.out.println(a.get(3));
		
		for(int i =0; i<a.size(); i++) {
			
			System.out.println(a.get(i));
		}
		
		System.out.println("*******************************************************");
		//enhanced loop
		for(String s: a) {
			System.out.println(s);
		}
		
		System.out.println(a.contains("Akshay"));

	}

}
