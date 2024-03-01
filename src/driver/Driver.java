package driver;

// import the package Scanner from the class Object 
import java.util.Scanner;

// import all created packages 
import item.Book;
import item.Journal;
import item.Media;
import Client.Client;
import item.Items;
import Library.Library;


public class Driver {
	
	static Scanner keyboard = new Scanner(System.in);
	
	


	
	// getBiggestBook()
	public static void getBiggestBook(Book bookarray[], int num)
	{
		Book arraymax = null;
		
		for (int i = 0; i < num-1; i++)
		{
			if (bookarray[i].getNumberofpages() > bookarray[i+1].getNumberofpages())
			{
				arraymax = bookarray[i];
			}
			else 
			{
				arraymax = bookarray[i+1];
			}
				
		}
		System.out.println();
		System.out.println("The largest book is: ");
		System.out.println();
		
		System.out.println(arraymax);
	}
	
	
	// copybooks()
	 public static Book[] copyBooks(Book [] originalbooks)
	 {
		 if (originalbooks == null)
		 {
			 return null;
		 }
		 // create a new array with the same length as the original book array
		 Book[] copiedBooks = new Book[originalbooks.length];
		 
		 // deep copy 
		 for (int i = 0; i < originalbooks.length; i++)
		 {
			 copiedBooks[i] = new Book(originalbooks[i]);
		 }
		 
		 return copiedBooks;
		 }
	
	
	
	
	// display of menu 
	public static void menu()
	{
		
		System.out.println();
		System.out.println("1. Add an item");
		System.out.println("2. Delete an item");
		System.out.println("3. Edit item information");
		System.out.println("4. List a type of items");
		System.out.println("5. Display all items");
		System.out.println("6. Add a client");
		System.out.println("7. Delete a client");
		System.out.println("8. Edit a client");
		System.out.println("9. Lease an item to a client");
		System.out.println("10. Return an item from a client");
		System.out.println("11. Show all items leased by a client.");
		System.out.println("12. Show all leased items.");
		System.out.println("13. Display the biggest book.");
		System.out.println("14. Make a copy of the books array.");
		System.out.println("15. Quit");
		
	}

	public static void main(String[] args) {
		
		
		int choice = 0;
		int maxitems = 15; // maximum number of items store in the library 
		int maxbook = 5;
		int maxjournal = 5;
		int maxmedia = 5;
		int maxlease = 30;
		int maxclient = 10;
		int numbook = 0;
		Library item;
		
		Library object = new Library();
		
		
		
		Items[] arrayitem = new Items[maxitems];
		Book [] arraybook = new Book[maxbook];
		Journal[] arrayjournal = new Journal[maxjournal];
		Media[] arraymedia = new Media[maxmedia];
		
		
		
		
		System.out.println("Welcome to FunReadings Library");
		System.out.println();
		System.out.print("To view the main menu press 1.  To view the predefined/hard-coded scenario press 2. ");
		int option = keyboard.nextInt();
		
		// PREDEFINED/HARD-CODED SCENARIO
		
		if (option == 2)
		{
			// create three different objects in each class
			Book B1 = new Book("To Kill a Mocking Bird", "Harper Lee", 1960, 323);
			Book B2 = new Book("Wuthering Heights", "Emily Bronte", 1847, 368);
			Book B3 = new Book("Eragon", "Christopher Paolini", 2003, 544);
			Journal J1 = new Journal("Journal of Climate", "Jed Norene", 2007, 7, 7);
			Journal J2 = new Journal("Journal of Climate", "Jed Norene", 2007, 7, 7);
			Journal J3 = new Journal("BioData Mining", "Elyse Jaycee", 2024, 1, 8);
			Media M1 = new Media("Princess Diaries", "Garry Marshall", 2001, "DVD"); 
			Media M2 = new Media("Iphone 7", "Steve Jobs", 2016, "Iphone");
			Media M3 = new Media("Uprising Live!", "Bob Marley", 2014, "CD");
			Client C1 = new Client("Emmett Hickman", 911, "client1@concordia.ca");
			Client C2 = new Client("Bobbie Sanchez", 911, "client2@concordia.ca");
			Client C3 = new Client("Garth Holden", 911, "client3@concordia.ca"); 
			
			// print all items
			System.out.println(B1);
			numbook = numbook+1;
			System.out.println();
			System.out.println(B2);
			numbook = numbook+1;
			System.out.println();
			System.out.println(B3);
			numbook = numbook+1;
			System.out.println();
			System.out.println(J1);
			System.out.println();
			System.out.println(J2);
			System.out.println();
			System.out.println(J3);
			System.out.println();
			System.out.println(M1);
			System.out.println();
			System.out.println(M2);
			System.out.println();
			System.out.println(M3);
			System.out.println();
			System.out.println(C1);
			System.out.println();
			System.out.println(C2);
			System.out.println();
			System.out.println(C3);
			
			// compare objects
			System.out.println();
			System.out.println("Testing equality of some of the created objects: ");
			System.out.println("The two objects are from different classes: " + B1.equals(J1)); // test two objects from different classes
			System.out.println("The two objects are from same classes with similar content: " + J1.equals(J2)); // test two objects from the same classes with similar values 
			System.out.println("The two objects are from same classes with different content: " + B1.equals(B2)); // test two objects from the same classes with different values */
			
			// assigning objects to arrays
			
			// assigning items to to the array item
			arrayitem[0] = B1;
			arrayitem[1] = B2;
			arrayitem[2] = B3;
			arrayitem[3] = J1;
			arrayitem[4] = J2;
			arrayitem[5] = J3;
			arrayitem[6] = M1;
			arrayitem[7] = M2;
			arrayitem[8] = M3;  
			
			// assigning items to the different array items
			arraybook[0] = B1;
			arraybook[1] = B2;
			arraybook[2] = B3;
			arrayjournal[0] = J1;
			arrayjournal[1] = J2;
			arrayjournal[2] = J3;
			arraymedia[0] = M1;
			arraymedia[1] = M2;
			arraymedia[2] = M3;
		
			// getBiggestBook()
			Driver.getBiggestBook(arraybook, numbook);
			
			// copybook()
			Book[] copiedBooks = copyBooks(arraybook);
			System.out.println();
			for (int i = 0; i < numbook; i++)
			{
			System.out.println("Copied Books: " + copiedBooks[i]);
			}
			
		}
		
		if (option == 1) 
		{
			do 
			{
			menu();
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter choice: ");
		choice = keyboard.nextInt();
		System.out.println();
		
		switch(choice)
		{ // start of switch
		
		// option 1 - add an item 
		case 1:
				Library.additem();
			break;
			
		case 2:
				Library.removeitem();
			break;
			
		// option 3 - Edit item information 
		case 3:
				Library.edititem();
			break;
		
		// option 4 - Display a list of items
		case 4:
			Library.displaytypelist();
			break;
		
		// option 5 - Display all items
		case 5:
			Library.displayallitems();
			
			break;
			// option 6 - add a client 
		case 6:
			Library.addclient();
						
			break;
			// option 7 - Delete a client
		case 7:
			Library.deleteclient();
			
			break;
			// option 8 - Edit a client
		case 8:
			Library.editclient();
				break;
			// option 9 - Lease to a client 
		case 9:
			Library.leaseitem();
				break;
			// option 10 - Return an item from a client 
		case 10:
			Library.returnitem();		
				break;
			// option 11 - show all items leased by a client
		case 11:
			Library.clientlease();	
				break;
			// option 12 - show all items leased by all clients 
		case 12:
			Library.displaylease();
				break;
			// display the biggest book 
		case 13:
			Driver.getBiggestBook(Library.array(), Library.num());
				break;
			// make a copy of the books array 
		case 14:
			Book[] copiedBooks = copyBooks(arraybook);
			System.out.println();
			for (int i = 0; i < numbook; i++)
			{
			System.out.println("Copied Books: " + copiedBooks[i]);
			}
			break;
						
					
					
		}
	} while (choice != 15);
			System.out.println("Thank you for using FunReadings Library");
		}
			
	}

}
		

