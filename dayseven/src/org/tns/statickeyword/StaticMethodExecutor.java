package org.tns.statickeyword;

public class StaticMethodExecutor {
	
	
	String str = "bkc";
	static float percentage =78.4f;
	//static method
	/* if any method outside  the main function and if you want to 
	 * access that method inside the main function make it static */
	static void displayscore(int score)
	{
		System.out.println(" percentage of student "+ percentage);
		//System.out.println(str);
		System.out.println(" Score is :"+ score);
	}

	public static void main(String[] args) {
		
		displayscore(56);

	}

}
