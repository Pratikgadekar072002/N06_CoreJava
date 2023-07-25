//program to demonstrate on default parameterized constructor
package org.tns.classandobject;

public class Library {
	
	public long noofbooks;
	public String authorname;
	public String bookname;
	public double price;
	public Library() {
		super();
		System.out.println("DEfault constructor");
	}
	public Library(long noofbooks, String authorname, String bookname, double price) {
		super();
		this.noofbooks = noofbooks;
		this.authorname = authorname;
		this.bookname = bookname;
		this.price = price;
		System.out.println("parametarized constructor");
	}
	@Override
	public String toString() {
		return "Library [noofbooks=" + noofbooks + ", authorname=" + authorname + ", bookname=" + bookname + ", price="
				+ price + "]";
	}
	
	
     
}
