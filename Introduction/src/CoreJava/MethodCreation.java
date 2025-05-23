package CoreJava;

public class MethodCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodCreation m = new MethodCreation();
		m.GetData();
		String name = m.getName();
		System.out.println(name);
		
		MethodCreation1 m2 = new MethodCreation1();
		String address = m2.getAddress();
		System.out.println(address);
		Age();
		MethodCreation1.getBloodGroup();
	}

	public void GetData() {
		System.out.println("Hello World");
		
	}
	public String getName() {
		System.out.println("Name is");
		
		return "Akshay Mule";
	}
	public static void Age() {
		System.out.println("29");
	}
}
