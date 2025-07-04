package CoreJava;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,4,5,6,8, 9, 12};
		
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2==0) {
				System.out.println("even no. "+ a[i]);
			}
		}
	}

}
