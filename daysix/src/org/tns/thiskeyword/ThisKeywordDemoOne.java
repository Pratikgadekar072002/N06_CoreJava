package org.tns.thiskeyword;

class Account
{
	long accNo;
	
	void setData(long accNo)
	{
		this.accNo = accNo;
	}
	
	void display()
	{
		System.out.println(accNo);
	}
}

public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account a = new Account();
		a.setData(25034562896L);
		a.display();

	}

}