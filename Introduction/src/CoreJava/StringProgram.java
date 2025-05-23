package CoreJava;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Akshay";
		String s2 = "Akshay";
		String s3 ="Mule";
		
		System.out.println(s1+" "+s2 +" "+s3);//The + operator is the most common and straightforward way to concatenate strings. 
		String result = s1.concat(s3);//The concat() method is a String class method that appends one string to the end of another.
		System.out.println(result);
		
		
		String s4 = new String("Happy");
		String s5 = new String("Happy");
		String s6 = new String("Birthdday");
System.out.println("********************************************");
		String[] Birthday = {"Happy", "Birthday", "Papa"};
		String s7 =  String.join(" ", Birthday);
		System.out.println(s7);
		
		System.out.println("Trim Operation");
		String s10 = "Akshay Mukundrao Mule";
		String [] newsplitstring = s10.split("Mukundrao");
		System.out.println(newsplitstring[0]);
		System.out.println(newsplitstring[1]);
		System.out.println(newsplitstring[1].trim());

		System.out.println("***********New Excercise***************");
		String s99 = "I Love India Very Much";
		String[] splitnew = s99.split("Very");
		System.out.println(splitnew[0]);
		System.out.println(splitnew[1]);
		System.out.println(splitnew[1].trim());
	}

}
