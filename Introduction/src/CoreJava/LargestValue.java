package CoreJava;

public class LargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {44,22,444,55,1111,8888};
		int largest = a[0];
		int sec = a[0];
		
		for(int i=1; i<a.length; i++){
			
			if(a[i]>largest) {
				largest = a[i];
			}
		}
		System.out.println("Largest value of array: " + largest);
	for(int j =0; j<a.length; j++ ) {
		if(a[j] > sec && a[j] < largest) {
			sec = a[j];
		}
		
	}
	System.out.println("Second Largest value of array: " + sec);
	}

}
