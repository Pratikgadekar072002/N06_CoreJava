package org.tns.abstractionkeyword;

public class AbstractClassExecutor {
	
	public static void main(String[]args)
	{
		//we can override the abstract method but can not over load the abstract method
		/*we can not create object for abstract class*/
		MasalaSandwich s=new MasalaSandwich();
		s.prepare();
		s.showReceipe();
	}

}
