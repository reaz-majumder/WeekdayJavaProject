package coreJava;

public class Computer {

	int year;
	String model;
	String display = "15 inch";
	//static variable/method where constructor is not needed for using/displaying variables in another class. Only class name is enough.
	//we do not need to create reference variable/object creation
	static String keys = "36 keys";

	//Hidden (empty) Constructor which is built in the class - 
	public Computer(){   	
	}
	
	/*Just like Public static void main(String [] args), multiple constructor can have also have/pass values
	inside the bracket*/ 
	//Multiple Constructor 
	public Computer(int year){
		this.year=year;
		System.out.println(year); 
	}
	
	public Computer(String model) {
			this.model=model;
			System.out.println(model); 
		}
	}
	
	

