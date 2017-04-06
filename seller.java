import java.awt.print.Book;

public class seller{
	private int accountNum;  //5 digits
	private float credit;
	private boolean[] listedItems = new boolean[5]; //this will initialize all values to false
	
	
	//some more functions we can add : displaySellerInfo
	
	public seller(int accountNum, float credit){
		this.accountNum = accountNum;
		this.credit = credit;
	}
	public void listABook (String ISBN, String title, String author, String edition, float price, String condition){
		int i = 0;
		while (i < 5){ //checks if the array listedItem has available space to sell
						//if the seller has an available slot to sell, set it to true
			if (listedItems[i] == false){ 
				listedItems[i] = true;
				book newBook = new book(ISBN, title, author, edition, price, condition);
				break;
			}
			else{ i++; }
				
		}
		
		
	}
	
	
	
	public void removeBook(String ISBN){
		
		System.out.println("Removed book: " + book.title);
	}

}	//end of seller class

