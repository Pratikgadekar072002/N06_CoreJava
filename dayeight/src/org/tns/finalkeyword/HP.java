package org.tns.finalkeyword;

public class HP extends Laptop {
	
	final String processor =" I5";
	//final method
	/* we cant ovveride final method*/
	/*void display() 
	{
		System.out.println(processor);
	}*/
	
	public void display(String processor) 
	{
		System.out.println(processor);
	}

	

}
