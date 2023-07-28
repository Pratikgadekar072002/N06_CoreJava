package in.bkcmet.edu;

public class Library {
	// different access specifier
	public String LibraryName;
	private long UserId;
	String BookName;
	
	public void displaypublic()
	{
		System.out.println("Library name : "+ LibraryName);
	}
	private void displayprivate()
	{
		System.out.println("user ID :"+UserId);
	}
	void displaydefaukt()
	{
		System.out.println("Book id :"+BookName);
	}

}
