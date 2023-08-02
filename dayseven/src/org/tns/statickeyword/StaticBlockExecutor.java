package org.tns.statickeyword;

public class StaticBlockExecutor {
	
	String str;
	static float salary;
	/* static block is used to initalize static variable and we cant inatalizee 
	 * any non static variable inside the block*/
	
	static {
		salary=7688.54f;
		//str="bkc";
	}
	
	static void show() 
	{
		System.out.println(salary);
	}

	public static void main(String[] args) {
	 
		/* main function is static and hence it calls static block method and variable by 
		 * default*/
	    show();

	}

}
