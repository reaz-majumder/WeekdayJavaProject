package coreJava;

public class Execution {
	public static void main (String [] args){
		
	////Computer
		
	//Object Creation Of a Class
		Computer refVar = new Computer();
	//Class name + reference variable = keyword + Constructor 
		refVar.model = "Asus";
		System.out.println(refVar.model);
	//Creating another object by calling another constructor with value/parametarised constructor
		Computer refVar2 = new Computer(2019);
		Computer refVar3 = new Computer("Mac");
		System.out.println(refVar.display);
		System.out.println(Computer.keys);
	
	//public void method() {
	//System.out.println(Computer.display); }
	
	
	////Method
	//Method Name + Reference Variable 'method' (all lower case, same as class name for better understanding + new(keyword) + constructor 
	Method method = new Method();
	//reference variable (method). variable from the Method class - example of non static method
	method.getAddress();
	//class name (Method).variable - example of static method, here we can use call variable using Class(name) since its static.
	Method.getTime();
	//reference variable (method). variable(value1,value2) - example of non static method (void type)
	//method.calculator3(7,8);
	//reference variable (method). variable(value1,value2) - example of non static method (return type)-where the method returns value and 
	//we can store that value and use later in the same class, here we are storing the return value in newValue.
	//method.calculator1(7,8);
	int newValue = method.calculator1(7,8);
	System.out.println(newValue);
	
	//example of static method (return type)-where the method returns value and we can store that value and use later in the same class, 
	//here we are storing the return value in newValue2.
	int newValue2 = Method.calculator2(10,5);
    System.out.println(newValue2);
	}
}
