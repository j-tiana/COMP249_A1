package item;

public class Media extends Items {
	private String type;
	private static int mediaID = 0;
	private int numofmedia;
	
	// default constructor 
	public Media()
	{
		super();
		this.type = type;
		numofmedia++;
	}
	
	// parameterized constructor 
	public Media(String itemname, String itemauthor, int itemyear, String type)
	{
		this.itemname = itemname;
		this.itemauthor = itemauthor;
		this.itemyear = itemyear;
		this.type = type;
		mediaID += 1;
		itemID = "M" + mediaID;
	}
	
	// copy constructor 
	public Media(Media other)
	{
		super(other.itemname, other.itemauthor, other.itemyear);
		this.type = other.type;
	}
	
	// mutators and accessors
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public int getMediaID() {
		return mediaID;
	}

	public void setMediaID(int mediaID) {
		this.mediaID = mediaID;
	}

	//toString()
	@Override
	public String toString()
	{
		return "The Media's information: \n" + "\t ID: " + itemID + "\n \t Name: " + itemname + "\n \t Author: "
				+ itemauthor + "\n \t Year: " + itemyear + "\n \t Type of Media: " + type;
	}
	
	//equals()
	@Override
	public boolean equals(Object otherObject)
	{
		if (otherObject == null) // check whether the object item is null
			return false;
		
		if (getClass() != otherObject.getClass()) // check whether the 
			return false;
		
		Media otherMedia = (Media) otherObject; // compare all attributes EXCEPT the ID to see if the object are equal
		
		if (itemname.equals(otherMedia.itemname) && itemauthor.equals(otherMedia.itemauthor) && (itemyear == otherMedia.itemyear))
		{
			return true;
		}
		else 
			return false;
	}
	
	

}
