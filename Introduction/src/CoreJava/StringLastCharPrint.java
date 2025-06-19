package CoreJava;

public class StringLastCharPrint {


	public static void main(String[] args) {
	String s = "Abhishek";
	String res = "";
	for(int i = 0; i <=s.length(); i++) {
		if(i == 0) {
			System.out.println("First chaar of String is " + s.charAt(i));
		}
		else if(i== s.length()-1) {
			System.out.println("Last chaar of String is " + s.charAt(i));
		}
		
	}
	
	char r = s.charAt(s.length()-1);
	System.out.println(r);
	}
}
