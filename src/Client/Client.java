package Client;

public class Client {
	private double clientID;
	private String name;
	private long phonenumber;
	private String emailaddress;
	

	// default constructor 
	public Client()
	{
		this.clientID = clientID;
		this.name = name;
		this.phonenumber = phonenumber;
		this.emailaddress = emailaddress;
	}

	// parameterized constructor 
	public Client(String name, long phonenumber, String emailaddress)
	{
		this.name = name;
		this.phonenumber = phonenumber;
		this.emailaddress = emailaddress;
		double doubleRandomNumber = Math.random()+1;
		this.clientID = doubleRandomNumber;
	}
	
	// copy constructor 
	public Client(Client other)
	{
		this.name = other.name;
		this.phonenumber = other.phonenumber;
		this.emailaddress = other.emailaddress;
		
	}

	// accessors and mutators 
	public double getclientID() {
		return clientID;
	}

	public void setclientID(double clientiD) {
		this.clientID = clientiD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	
	// toString()
	public String toString()
	{
		return "The Client's information: \n" + "\t ID: " + clientID + "\n \t Name: " + name + "\n \t Phone Number: "
				+ phonenumber + "\n \t Email Address: " + emailaddress;
	}
	
	// equals()
	public boolean equals(Object otherObject)
	{
		if (otherObject == null) // check whether the object item is null
			return false;
		
		
		if (getClass() != otherObject.getClass()) // check whether the 
			return false;
		
		Client otherClient = (Client) otherObject; // compare all attributes EXCEPT the ID to see if the object are equal
		
		if (name.equals(otherClient.name) && phonenumber == otherClient.phonenumber && emailaddress.equals(otherClient.emailaddress))
		{
		return true;
		}
		else 
		return false; 

	}  
	
	
	
	

}
