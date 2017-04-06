import java.util.Scanner; 

public class swapApplication {		
	
	public static void main(String[] args){
		String sellerName, bookDetails;
		float boatPrice;
		
		//just tests
		Scanner input = new Scanner(System.in);
		book firstBook = new book("123", "New", "Ender's Games", "1985", "Textbook", "Orson Scott Card", 10.95f);
		firstBook.displayInfo();
		firstBook.status();
		book secondBook = new book("133", "New", "Ender", "1885", "Novel", "Orson Card", 11.95f);
		secondBook.displayInfo();
	}
	
	
	public String sellerName;
	public String bookDetails;
	public float bookPrice;
	public Boolean bookStatus;
	
	
	public swapApplication(String sellerName, String bookDetails, float bookPrice, Boolean bookStatus){
		this.sellerName = sellerName;
		this.bookDetails = bookDetails;
		this.bookPrice = bookPrice;
		this.bookStatus = bookStatus;
	}
	
	public void searchTitle(String title){
		
	}
	
	public void searchISBN(String ISBN){
		
	}
	
	public boolean transaction(){

		return true;
	}
}
