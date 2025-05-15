package CoreJava;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>a =  new ArrayList<String>();
		a.add("Akshay");
		a.add("Mule");
		a.add("Cybage");
		a.add("Software");
		System.out.println(a.get(2));
		System.out.println(a.size());
		a.remove(2);
		System.out.println(a.get(0));
		
		System.out.println(a.get(2));
		System.out.println(a.size());
	}

}
