package coreJava;

public class DataTypes {
	public static void main(String [] args) {
		
		//primitive datatypes
		String firstname = "Apu";
		String lastname = "Ahmed";
		
		System.out.println(firstname+" "+lastname);
	
		//Byte - 8 bit
		byte number = -128;
		byte number2 = 127;
		
		//short - 16 bit
		short x = -32_768;
	    short y = 32_767;
		
	  //int - 32 bit
	    int a = -2_147_483_648;
	    int b = 2_147_483_647;
	
	  //long - 64 bit - l (always use l at the end of the number)
	    long z = 34765948666552552l;
	  
	  //double - decimal 64 bit - d (always use d at the end of the number)
	    double f = 1.33d;
	    
	  //float - 34 bit - f (always use f at the end of the number)
	    float g = 1.222f;
	    
	  //char - special character like @, & etc-unicode 16 bit-need to put a backslash at first/unicode table 
	    char h = '\u00e5';
	    System.out.println(h);
	
	    //boolean - true or false
	    boolean s = false;
	    System.out.println(s);
	}
	
}
