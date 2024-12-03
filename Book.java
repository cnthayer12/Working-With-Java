
public class Book {

		private String title;
		private String author;
		private double price;
		
		public  Book()
		{
			this.title = "unknown";
			this.author = "anonymous";
			this.price = 0;
				
		}
		
		public Book(String xTitle, String xAuthor, double xPrice)
		{
			this.setTitle(xTitle);
			this.setAuthor(xAuthor);
			this.setprice(xPrice);
		}
		
		public String getTitle()
		{
			return this.title;
		}
		
		public String getAuthor()
		{
			return this.author;
		}
		
		public double getPrice()
		{
			return this.price;
		}
		
		public void setTitle(String xTitle)
		{
			this.title = xTitle;
		}
		
		public void setAuthor(String xAuthor)
		{
			this.author = xAuthor;
		}
		
		public void setprice(double xPrice)
		{
			if(price >0)
			{
				this.price = xPrice;
			}
			else
			{
				System.out.println("Invalid value entered for book price");
			}
		}
		
		public boolean equals(Book bk)
		{
			return this.title.equalsIgnoreCase(bk.getTitle())
					&& this.author.equalsIgnoreCase(bk.getAuthor())
							&& this.price == bk.getPrice();
		}
		
		public String toString()
		{
			return "Book Title: "+this.title
					+"\nAuthor: "+this.author
					+"\nPrice: $"+this.price;
			
		}
}
