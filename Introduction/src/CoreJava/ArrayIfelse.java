package CoreJava;

public class ArrayIfelse {
	
	public static void main(String[] args) {
	int[] arr = {11,22,33,44,2,4,5,6,9,999};
	
	for(int i =0; i<arr.length; i++) {
		if(arr[i]%2 == 0) {
			System.out.println("Divided by 2 number is "+arr[i] );
			//break; //breaks loop when 1st condition satisfies
		}
		else {
			System.out.println("Not Divided by 2 number is "+arr[i] );
		}
	}

}
	
}
