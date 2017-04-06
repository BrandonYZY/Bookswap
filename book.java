
public class book {
		private String ISBN;
		private String condition;
		private String title; 
		private String author;
		private String edition;
		private static int stock = 0;  //static adds additional books of same ISBN;
		public float price;
		
		public book(String ISBN, String title, String author, String edition, float price, String condition){ 
			// we can add a mysql statement here to insert values
			this.ISBN = ISBN;
			this.title = title;
			this.author = author;
			this.price = price;
			this.condition = condition;
			this.stock++;
			}
		
		
		
		public static void status(){
			if (stock > 0) System.out.println("In stock");
			else System.out.println("Out of stock");			
		}
		
		
		public void displayInfo(){
			System.out.println("ISBN: " + ISBN);
			System.out.println("Title: " + title);
			System.out.println("Author: " + author);
			System.out.println("Edition: " + edition);
			System.out.println("Price: " + price);
			System.out.println("Condition: " + condition);
			System.out.println("Stock: " + stock);
			
			
		}
		
		
} // end of book class