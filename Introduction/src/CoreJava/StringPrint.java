package CoreJava;

public class StringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//How to print String
		
		String def = "";
		String a = "Akshay Mukundrao Mule";
		for(int i = 0; i<a.length(); i++) {
			
		System.out.print(a.charAt(i));	
		}
		System.out.println("              Zero index Char   is          "+ a.charAt(0));
		
		//how to print string in reverse order

		System.out.println("*************************************************************************************************");
		System.out.println(" string in reverse order  ");
		for(int i = a.length()-1; i>=0; i--) {
				System.out.print(a.charAt(i));
			//def = def+a.charAt(i);	//append string
			}
		//System.out.println(def);
		
	}
	
	
}
                                                                                                                    