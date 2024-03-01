package Library;


import java.util.Scanner;

import Client.Client;
import item.Items;
import item.Book;
import item.Journal;
import item.Media;

public class Library {
	private static Items[] arrayitem = new Items[15];
	private static Book[] arraybook = new Book[5];
	private static Journal[] arrayjournal = new Journal[5];
	private static Media[] arraymedia = new Media[5];
	private static int numofitem = 0;
	private static int numofbook = 0;
	private static int numofjournal = 0;
	private static int numofmedia = 0;
	private static String ID;
	private static int numofclient = 0;
	private static int numoflease = 0;
	private static Client [] arrayclient = new Client[10];
	private static Object[][] arraylease = new Object[20][20];
	private static int tracknum = 0;
 
	static Scanner keyboard = new Scanner(System.in);
	
	// default constructor 
	public Library()
	{
		this.arrayitem = arrayitem;
		this.arraybook = arraybook;
		this.arrayjournal = arrayjournal;
		this.arraymedia = arraymedia;
		
	}
	
	// return details of an item 
	public static String userresponsename()
	{
		System.out.print("Enter the name: ");
		String responsename = keyboard.next();
		return (responsename);
	}
	
	public static String userresponseauthor()
	{
		System.out.print("Enter the author: ");
		String responseauthor = keyboard.next();
		return (responseauthor);
	}
	
	public static int useresponseyear()
	{
		System.out.print("Enter the year: ");
		int responseyear = keyboard.nextInt();
		return (responseyear);
		
	}
	
	public static int userresponsepage()
	{
		System.out.print("Enter the number of pages: ");
		int responsepage = keyboard.nextInt();
		return(responsepage);
	}
	
	public static int userresponsevolume()
	{
		System.out.print("Enter the volume: ");
		int responsevolume = keyboard.nextInt();
		return(responsevolume);
	}
	
	public static String userresponsetype()
	{
		System.out.print("Enter the media type: ");
		String responsetype = keyboard.next();
		return(responsetype);
	}
	
	public static Items emptyitem()
	{
		Items emptyitem = new Items(" " , " ", 0);
		return emptyitem;
	}
	
	public static Book emptybook()
	{
		Book emptybook = new Book(" " , " ", 0, 0);
		return emptybook;
	}
	
	public static Journal emptyjournal()
	{
		Journal emptyjournal = new Journal(" " , " ", 0, 0, 0);
		return emptyjournal;
	}
	
	public static Media emptymedia()
	{
		Media emptymedia = new Media(" " , " ", 0, " ");
		return emptymedia;
	}
	
	// ADD ITEM

	public static void additem()
	{
		System.out.println("What type of item would you like to add? ");
		
		String response = keyboard.next();
		System.out.println();
		
		if (response.equalsIgnoreCase("book"))
		{
		
			Book newbook = new Book(Library.userresponsename(), Library.userresponseauthor(), Library.useresponseyear(), Library.userresponsepage());
			// print information
			System.out.println();
			System.out.println("You added: ");
			System.out.println(newbook);
			numofbook++;
			numofitem++;
			
			for (int i = 0; i < numofbook; i++)
			{
				if (arraybook[i] == Library.emptybook())
				{
					arraybook[i] = newbook;
					System.out.print(arraybook[i] + "---> that's if empty");
					numofbook--;
				}
				else
				{
			arraybook[numofbook-1] = (Book) newbook;
				}
			}
			for (int j = 0; j < numofitem; j++)
			{
				if (arrayitem[j] == Library.emptyitem())
				{
					arrayitem[j] = newbook;
					System.out.print(arrayitem[j] + "---> that's if empty");
					numofitem--;
				}
				else
				{
			arrayitem[numofitem-1] = newbook;
				}
			}
		}
		if (response.equalsIgnoreCase("journal"))
		{
			Journal newjournal = new Journal(userresponsename(), userresponseauthor(), useresponseyear(), userresponsepage(), userresponsevolume());
			// print information
			System.out.println();
			System.out.println("You added: ");
			System.out.println(newjournal);
			numofjournal++;
			numofitem++;
			
			for (int i = 0; i < numofjournal; i++)
			{
				if (arrayjournal[i] == Library.emptyjournal())
				{
					arrayjournal[i] = newjournal;
					System.out.print(arrayjournal[i] + "---> that's if empty");
					numofjournal--;
				}
				else
				{
			arrayjournal[numofjournal-1] = (Journal) newjournal;
				}
			}
			for (int j = 0; j < numofitem; j++)
			{
				if (arrayitem[j] == Library.emptyitem())
				{
					arrayitem[j] = newjournal;
					System.out.print(arrayitem[j] + "---> that's if empty");
					numofitem--;
				}
				else
				{
			arrayitem[numofitem-1] = newjournal;
				}
			}
		}
		
		if (response.equalsIgnoreCase("media"))
		{
			Media newmedia = new Media(userresponsename(), userresponseauthor(), useresponseyear(), userresponsetype());
			// print information
			System.out.println();
			System.out.println("You added: ");
			System.out.println(newmedia);	
			numofmedia++;
			numofitem++;
			
			for (int i = 0; i < numofmedia; i++)
			{
				if (arraymedia[i] == Library.emptymedia())
				{
					arraymedia[i] = newmedia;
					System.out.print(arrayjournal[i] + "---> that's if empty");
					numofmedia--;
				}
				else
				{
			arraymedia[numofmedia-1] = (Media) newmedia;
				}
			}
			for (int j = 0; j < numofmedia; j++)
			{
				if (arraymedia[j] == Library.emptymedia())
				{
					arrayitem[j] = newmedia;
					System.out.print(arrayitem[j] + "---> that's if empty");
					numofitem--;
				}
				else
				{
			arrayitem[numofitem-1] = newmedia;
				}
			}
		}
		
	}
	// EDIT ITEM
	
	public static void edititem()
	{
		System.out.println("What type of item would you like to change?");
		String response3 = keyboard.next();
		
		if (arraybook == null)
		{
			System.out.println("No book in the library.");
		}
		
		else 
		{
		if (response3.equalsIgnoreCase("book"))
		{
			
			
			System.out.println("Enter the item's ID");
			ID = keyboard.next();
			int state = 0;
			
			for (int i = 0; i < numofitem; i++)
			{
				if (ID.equals(arrayitem[i].getID()) == true)
				{
					int tempnumofitem = i;
					System.out.println("Enter the book with the edit information: ");
					Book book = (Book)arrayitem[i];
					book.setName(userresponsename()); // FIX FOR JOURNA
					book.setAuthor(userresponseauthor());
					book.setYear(useresponseyear());
					book.setNumberofpages(userresponsepage());
					
					state = -1;
					
				for (int j = 0; j < numofbook; j++)
					if (ID.equals(arraybook[j].getID()) == true)
						{
					tempnumofitem = j;
					arraybook[tempnumofitem] = book;
					}
				}
				else if (state == 0)
				{
					System.out.println("The book does not exist in the library");
				}
			}
			

				
			
			
			
		}
		}
		
		
		
		
		if (response3.equalsIgnoreCase("journal"))
		{
			if (arrayjournal == null)
			{
				System.out.println("No journal in the library.");
			} 
			else
			{
			System.out.println("Enter the item's ID");
			ID = keyboard.next();
			int state = 0;
			
			for (int i = 0; i < numofitem; i++)
			{
				if (ID.equals(arrayitem[i].getID()) == true)
				{
					int tempnumofitem = i;
					System.out.println("Enter the book with the edit information: ");
					Items newjournal = new Journal(userresponsename(), userresponseauthor(), useresponseyear(), userresponsepage(), userresponsevolume());
					arrayitem[tempnumofitem] = newjournal;
					state = -1;
					
					for (int j = 0; j < numofbook; j++)
						if (ID.equals(arraybook[j].getID()) == true)
						{
							tempnumofitem = j;
							arrayitem[tempnumofitem] = newjournal;
						}
				}
				else if (state == 0)
				{
					System.out.println("The journal does not exist in the library");
				}
			
		}
			}
		}
		
		if (response3.equalsIgnoreCase("media"))
		{
			if (arraymedia == null)
			{
				System.out.println("No media in the library.");
			}
			
			else
			{
			System.out.println("Enter the item's ID");
			ID = keyboard.next();
			int state = 0;
			
			for (int i = 0; i < numofitem; i++)
			{
				if (ID.equals(arrayitem[i].getID()) == true)
				{
					int tempnumofitem = i;
					System.out.println("Enter the book with the edit information: ");
					Items newmedia = new Media(userresponsename(), userresponseauthor(), useresponseyear(), userresponsetype());
					arrayitem[tempnumofitem] = newmedia;
					state = -1;
					
					for (int j = 0; j < numofbook; j++)
						if (ID.equals(arraybook[j].getID()) == true)
						{
							tempnumofitem = j;
							arrayitem[tempnumofitem] = newmedia;
						}
				}
				else if (state == 0)
				{
					System.out.println("The Media does not exist in the library");
				}
			}
		}
		}
	}
	
	// REMOVE ITEM 
	public static void removeitem()
	{
	System.out.print("What type of item would you like to remove? ");
	String response3 = keyboard.next();
	if (response3.equalsIgnoreCase("book"))
	{
		if (arraybook == null)
		{
			System.out.println("No books in the library to remove");
		}
		else if (arraybook.length == 1)
		{
			arraybook[0] = null;
			System.out.println("The book was removed.");
		}
		else
		{
			System.out.print("Enter ID: ");
			ID = keyboard.next();
			int state = 0;
			boolean found = false;
			int removeIndex = -1;
			
			for (int i = 0; i < arraybook.length; i++)
			{
				if (ID.equals(arraybook[i].getID()) == true)
				{
					// shift the element to the left to remove the item 
					found = true;
					removeIndex = i;
					state = -1;
					break;
				}
				
				
				if (found)
				{
					for (int j = removeIndex; j < arraybook.length - 1; j++) {
		                arraybook[i] = arraybook[i + 1];
		            }
		            arraybook[arraybook.length - 1] = null;
		            numofbook = numofbook -1;
				}
				else 
					System.out.println("The book does not exist in the library");
			}
		}
		
	}
	
	if (response3.equalsIgnoreCase("journal"))
	{
		if (arrayjournal == null)
		{
			System.out.println("No journal in the library to remove");
		}
		
		else
		{
		System.out.println("Enter ID");
		ID = keyboard.next();
		int state = 0;
		
		for (int i = 0; i < numofitem; i++)
		{
			if (ID.equals(arrayitem[i].getID()) == true)
			{
				arrayitem[i] = Library.emptyitem();
				arrayjournal[i] = Library.emptyjournal();
				System.out.println("The journal has been deleted");
				state = -1;
			}
			else if (state == 0)
			{
				System.out.println("The book does not exist in the library");
			}
		}
		}
		
	}
	
	if (response3.equalsIgnoreCase("media"))
	{
		if (arrayjournal == null)
		{
			System.out.println("No media in the library to remove");
		}
		
		else
		{
			System.out.println("Enter ID");
			ID = keyboard.next();
			int state = -1;
			
			for (int i = 0; i < numofitem; i++)
			{
				if (ID.equals(arrayitem[i].getID()) == true)
				{
					arrayitem[i] = Library.emptyitem();
					arraymedia[i] = Library.emptymedia();
					System.out.println("The media has been deleted");
					state = 0;
				}
				else if (state == 0)
				{
					System.out.println("The book does not exist in the library");
				}
			}
		}
	}
	}

	
	// DISPLAY A LIST OF ITEM 
	
	public static void displaytypelist()
	{
		System.out.println("What type of items would you like to view?");
		System.out.println(numofbook);
		String response4 = keyboard.next();
		
		if (response4.equalsIgnoreCase("book"))
		{
			for(int i = 0; i < numofbook; i++)
			{
				System.out.println(arraybook[i]);
				System.out.println();
			}
		}
		
		if (response4.equalsIgnoreCase("journal"))
		{
			for(int i = 0; i < numofjournal; i++)
			{
				System.out.println(arrayjournal[i]);
				System.out.println();
			}
		}
		
		if (response4.equalsIgnoreCase("media"))
		{
			for(int i = 0; i < numofmedia; i++)
			{
				System.out.println(arraymedia[i]);
				System.out.println();
			}
		}
	}
	
	// DISPLAY ALL ITEMS
	public static void displayallitems()
	{
		for(int i = 0; i < numofitem; i++)
		{
			System.out.println(arrayitem[i]);
			System.out.println();
		}
	}
	
	
	// CLIENT PORTION
	
	public static String userclientname()
	{
		System.out.print("Enter the name: ");
		String clientname = keyboard.next();
		return (clientname);
	}
	
	public static int userclientnumber()
	{
		System.out.print("Enter phone number: ");
		int clientphonenumber = keyboard.nextInt();
		return (clientphonenumber);
		
	}
	
	public static String userclientemailaddress()
	{
		System.out.print("Enter email address: ");
		String clientemailaddress = keyboard.next();
		return(clientemailaddress);
	}
	
	public static void addclient()
	{
		Client newclient = new Client(userclientname(), userclientnumber(), userclientemailaddress());
		numofclient++;
		System.out.println();
		System.out.println(newclient);
		arrayclient[numofclient-1] = newclient;
	}
	
	public static void deleteclient()
	{
		System.out.println("Enter the client you would like to delete: ");
		Client newclient1 = new Client(userclientname(), userclientnumber(), userclientemailaddress());
		// print information
		System.out.println();

		for (int i = 0; i < numofclient; i++)
		{
			if (ID.equals(arrayclient[i].getclientID()) == true)
			{
				int tempnumofclient = i;
				arrayclient[tempnumofclient] = null;
			}
		}
	}
	
	public static void editclient()
	{
		System.out.println("Which client's information would you like to edit?");
		Client newclient2 = new Client(userclientname(), userclientnumber(), userclientemailaddress());
		
		
		for (int i = 0; i < numofclient; i++)
		{
			if (ID.equals(arrayclient[i].getclientID()) == true)
			{
				int tempnumofclient = i;
				System.out.println("Enter the client with the edited information: ");
				Client newbook2 = new Client(userclientname(), userclientnumber(), userclientemailaddress());
				arrayclient[tempnumofclient] = newclient2;
			}
		}
	}
	
	public static void leaseitem()
	{
		System.out.println("Enter the client: ");
		Client newclient3 = new Client(userclientname(), userclientnumber(), userclientemailaddress());
		for (int i = 0; i < numofclient; i++)
		{
			if (newclient3.equals(arrayclient[i]) == true)
			{
				System.out.println("The client was found.");
			}
		}
		
		System.out.println("Which type of item would you like to lease?");
		String response9 = keyboard.next();
		
		if(response9.equalsIgnoreCase("book"))
		{
			Items newbook = new Book(Library.userresponsename(), Library.userresponseauthor(), Library.useresponseyear(), Library.userresponsepage());
			
			for (int i = 0; i < numofitem; i++)
			{
				if (newbook.equals(arrayitem[i]) == true)
				{
					System.out.println("The book was found.");
					numoflease++;
				}
			}
			
			arraylease [numoflease-1][0] = (newclient3);
			arraylease [numoflease-1][1] = (newbook);
			
		}
		
		if(response9.equalsIgnoreCase("journal"))
		{
			Items newjournal = new Journal(Library.userresponsename(), Library.userresponseauthor(), Library.useresponseyear(), Library.userresponsepage(), Library.userresponsevolume());
			
			for (int i = 0; i < numofitem; i++)
			{
				if (newjournal.equals(arrayitem[i]) == true)
				{
					System.out.println("The book was found.");
					numoflease++;
				}
			}
			
			arraylease [numoflease-1][0] = (newclient3);
			arraylease [numoflease-1][1] = (newjournal);
			
		}
		
		if(response9.equalsIgnoreCase("media"))
		{
			Items newmedia = new Media(Library.userresponsename(), Library.userresponseauthor(), Library.useresponseyear(), Library.userresponsetype());
			
			for (int i = 0; i < numofitem; i++)
			{
				if (newmedia.equals(arrayitem[i]) == true)
				{
					System.out.println("The book was found.");
					numoflease++;
				}
			}
			
			arraylease [numoflease-1][0] = (newclient3);
			arraylease [numoflease-1][1] = (newmedia);
			
		}
		
	}
	
	public static void returnitem()
	{
	System.out.println("Enter the client:");
	Client newclient4 = new Client(userclientname(), userclientnumber(), userclientemailaddress());
	for (int i = 0; i < numofclient; i++)
	{
		if (newclient4.equals(arrayclient[i]) == true)
		{
			System.out.println("The client was found.");
		}
	}
	
	System.out.println("Which item would you like to return?");
	String response10 = keyboard.next();
	
	if(response10.equalsIgnoreCase("book"))
	{
		Items newbook = new Book(Library.userresponsename(), Library.userresponseauthor(), Library.useresponseyear(), Library.userresponsepage());
		
		for (int i = 0; i < numofitem; i++)
		{
			if (newbook.equals(arrayitem[i]) == true)
			{
				System.out.println("The book was found.");
				tracknum = i;
				arraylease [i][0] = null;
				arraylease [i][1] = null;
			}
		}
		
	}
	
	if(response10.equalsIgnoreCase("journal"))
	{
		Items newjournal = new Journal(Library.userresponsename(), Library.userresponseauthor(), Library.useresponseyear(), Library.userresponsepage(), Library.userresponsevolume());
		
		for (int i = 0; i < numofitem; i++)
		{
			if (newjournal.equals(arrayitem[i]) == true)
			{
				System.out.println("The book was found.");
				tracknum = i;
				arraylease [i][0] = null;
				arraylease [i][1] = null;
			}
		}
		
	}
	
	if(response10.equalsIgnoreCase("media"))
	{
		Items newmedia = new Media(Library.userresponsename(), Library.userresponseauthor(), Library.useresponseyear(), Library.userresponsetype());
		
		for (int i = 0; i < numofitem; i++)
		{
			if (newmedia.equals(arrayitem[i]) == true)
			{
				System.out.println("The book was found.");
				tracknum = i;
				arraylease [i][0] = null;
				arraylease [i][1] = null;
			}
		}
		
		
		
	}
}
	
	
	public static void displaylease()
{
	for (int i = 0; i < numoflease; i++)
		for (int j = 1; j < 2; j++)
		{
			System.out.println(arraylease[i][j]);
		}

}
	
	public static void clientlease()
	{
		System.out.println("Enter the client:");
		Client newclient5 = new Client(userclientname(), userclientnumber(), userclientemailaddress());
		for (int i = 0; i < numofclient; i++)
		{
			if (newclient5.equals(arrayclient[i]) == true)
			{
				System.out.println("The client was found.");
			}
		}
		for (int j = 0; j < numoflease; j++)
			if (newclient5.equals(arraylease[0][j]) == true)
			{
				System.out.println(arraylease[j][1]);
			}
	}
	
public static Book[] array()
{
	return arraybook;
}

public static int num()
{
	return numofbook;
}

} // end of class 
