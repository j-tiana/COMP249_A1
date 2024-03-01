package item;

public class Items 
{
	protected String itemID;
	protected String itemname;
	protected String itemauthor;
	protected int itemyear;
	
	// default constructor
	public Items() 
	{
		this.itemID = itemID;
		this.itemname = itemname;
		this.itemauthor = itemauthor;
		this.itemyear = itemyear;
	}
	
	// parameterized constructor 
	public Items(String itemname, String itemauthor, int itemyear)
	{
		this.itemname = itemname;
		this.itemauthor = itemauthor;
		this.itemyear = itemyear;
	}
	
	// copy constructor 
	public Items(Items other)
	{
		this.itemname = other.itemname;
		this.itemauthor = other.itemauthor;
		this.itemyear = other.itemyear;
	}
	
	// Accessors and mutators
	public String getID() {
		return itemID;
	}

	public void setID(String iD) {
		itemID = itemID;
	}

	public String getName() {
		return itemname;
	}

	public void setName(String itemname) {
		this.itemname = itemname;
	}

	public String getAuthor() {
		return itemauthor;
	}

	public void setAuthor(String itemauthor) {
		this.itemauthor = itemauthor;
	}

	public int getYear() {
		return itemyear;
	}

	public void setYear(int itemyear) {
		this.itemyear = itemyear;
	}
	
	//toString method
	public String toString()
	{
		return "The Item's information: \n" + "\t ID: " + itemID + "\n \t Name: " + itemname + "\n \t Author: "
				+ itemauthor + "\n \t Year: " + itemyear;
	}
	
	//equals method
	public boolean equals(Object otherObject)
	{
		if (otherObject == null) // check whether the object item is null
			return false;
		
		if (getClass() != otherObject.getClass()) // check whether the 
			return false;
		
		Items otherItems = (Items) otherObject; // compare all attributes EXCEPT the ID to see if the object are equal
		
		if (itemname.equals(otherItems.itemname) && itemauthor.equals(otherItems.itemauthor) && (itemyear == otherItems.itemyear))
		{
			return true;
		}
		else 
			return false;
	}
	
	

}

	
