package CoreJava;

public class LowestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a = {1,1111,333,444,22,44,55};
		int lowest =  a[0];
		int sec =Integer.MAX_VALUE;
		for(int i=1; i<a.length; i++) {
			if(lowest > a[i]) {
				lowest = a[i];
			}
		}
		System.out.println("Lowest Value Of An Array: "+ lowest);
		
		//second lowest
		for(int i=1; i<a.length; i++) {
			if(a[i] != lowest && a[i] < sec) {
				sec = a[i];
			}
		}
		System.out.println(" Second Lowest Value Of An Array: "+ sec);
	}
	
	

}
