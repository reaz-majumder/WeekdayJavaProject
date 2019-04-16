package coreJava;

public class Method {

	// Non Static Method - Void
	
	public void getAddress(){
		System.out.println("My Address is ......");
	}
	
	public void calculator3(int a,int b) {
		int total = a+b;
		System.out.println(total);
	}
	
	//Static Method - Void
	
	public static void getTime() {
		System.out.println("Current Time is ......");
	}
	
	// Non Static Method - Return Type
	
	public int calculator1(int a,int b) {
		int total = a+b;
		//System.out.println(total);
		return total;
	}
    
	//Static Method - Return Type  
	
	//method data type and return data type should be same
	public static int calculator2(int a,int b) {
		int total = a-b;
		return total;
	
	}
	
}
