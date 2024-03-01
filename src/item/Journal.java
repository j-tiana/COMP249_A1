package item;

public class Journal extends Items {
	private int volumenumber;
	private int numberofpages;
	private static int IDjournal = 0;
	
	
	// default constructor 
	public Journal()
	{
		super();
		this.volumenumber = this.volumenumber;
		this.numberofpages = 0;
		
		
	}
	
	// parameterized constructor
	public Journal(String itemname, String itemauthor, int itemyear, int numberofpages, int volumenumber)
	{
		this.itemname = itemname;
		this.itemauthor = itemauthor;
		this.itemyear = itemyear;
		this.volumenumber = volumenumber;
		if (numberofpages < 0)
			this.numberofpages = 0;
		else 
			this.numberofpages = numberofpages;
		IDjournal += 1;
		itemID = "J" + IDjournal;
		
	}
	

	// copy constructor
	public Journal (Journal other)
	{
		this(other.itemauthor, other.itemname, other.itemyear, other.numberofpages, other.volumenumber);
	}
	
	// accessors and mutators
	public int getVolumenumber() {
		return volumenumber;
	}

	public void setVolumenumber(int volumenumber) {
		this.volumenumber = volumenumber;
	}

	public int getNumberofpages() {
		return numberofpages;
	}

	public void setNumberofpages(int numberofpages) {
		this.numberofpages = numberofpages;
	}
	
	public int getIDjournal() {
		return IDjournal;
	}

	public void setIDjournal(int iDjournal) {
		IDjournal = iDjournal;
	}
	
	// toString()
	@Override
	public String toString()
	{
		return "The Journal's information: \n" + "\t ID: " + itemID + "\n \t Name: " + itemname + "\n \t Author: "
				+ itemauthor + "\n \t Year: " + itemyear + "\n \t Number of Pages: " + numberofpages + "\n \t Volume Number: " + volumenumber;
	}
	
	// equals()
	@Override
	public boolean equals(Object otherObject)
	{
		if (otherObject == null) // check whether the object item is null
			return false;
		
		if (getClass() != otherObject.getClass()) // check whether the 
			return false;
		
		Journal otherJournal = (Journal) otherObject; // compare all attributes EXCEPT the ID to see if the object are equal
		
		if (itemname.equals(otherJournal.itemname) && itemauthor.equals(otherJournal.itemauthor) && (itemyear == otherJournal.itemyear))
		{
			return true;
		}
		else 
			return false;
	}
	
	

	

}
