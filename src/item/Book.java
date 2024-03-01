package item;

public class Book extends Items {
	private int numberofpages;
	private static int bookID = 0;

	public Book()
	{
		super();
	}
	
	public Book(String itemname, String itemauthor, int itemyear, int numberofpages)
	{
		
		this.itemname = itemname;
		this.itemauthor = itemauthor;
		this.itemyear = itemyear;
		if (numberofpages < 0)
			this.numberofpages = 0;
		else
			this.numberofpages = numberofpages;
		bookID += 1;
		itemID = "B" + bookID;
	}
	
	
	public Book(Book other)
	{
		if (other != null)
		{
		this.itemauthor = other.itemauthor; 
		this.itemname = other.itemname;
		this.itemyear = other.itemyear;
		this.numberofpages = other.numberofpages;
		}
	}
	
	public int getNumberofpages() {
		return numberofpages;
	}

	public void setNumberofpages(int numberofpages) {
		this.numberofpages = numberofpages;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookiD) {
		bookID = bookiD;
	}

	// toString()
	@Override
	public String toString()
	{
		return "The Book's information: \n" + "\t ID: " + itemID + "\n \t Name: " + itemname + "\n \t Author: "
				+ itemauthor + "\n \t Year: " + itemyear;
	}
	
	
	
	//equals()
	@Override
	public boolean equals(Object otherObject)
	{
		
		if (otherObject == null) // check whether the object item is null
			return false;
		
		if (getClass() != otherObject.getClass()) // check whether the 
			return false;
		
		Book otherBook = (Book) otherObject; // compare all attributes EXCEPT the ID to see if the object are equal
		
		if (itemname.equals(otherBook.itemname) && itemauthor.equals(otherBook.itemauthor) && (itemyear == otherBook.itemyear))
		{
			return true;
		}
		else 
			return false;
	}
	

	
	
}
