package in.kkwagh.edu;
import in.bkcmet.edu.Library;
//import in.bkcmet.edu.*;

public class FacultyExecutor {

	public static void main(String[] args) {
		Library l= new Library();
		l.LibraryName="MET-BKC";
		l.displaypublic();
		
		/*private only can be acces within the  class not outsidee the class or packages*/
		/*l.UserId=12345;
		l.displayprivate();*/
		
		/*books name and displaydefault() method is default we cant access it within the package*/
		
		//l.BookName;
		//l.displaydefault();
	}

}
