package CoreJava;

public class Vowels {

	public static void main(String[] args) {
		
  Vowels v = new Vowels();
  v.vowels();

	}
	
	void vowels(){
		char ch;
		String s = "Rutuja";
		s = s.toLowerCase();
		for(int i=0; i<s.length(); i++) {
			ch = s.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') {
				System.out.println(ch + "");
			}
			else {
				System.out.println("Constants " +ch + "");
			}
		}
	}
}
