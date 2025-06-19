package CoreJava;

public class RevWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "hello world";
			String a[] = s.split(" ");
			
			String res = "" ;
			
			for(int i =a.length-1; i>=0; i--) {
				res = res+ a[i]+ " ";
			}
			
			System.out.println(res.substring(0, res.length()-1));
	}

}
