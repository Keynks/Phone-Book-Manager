package phoneBook;

import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Pbook_main {
	
	private static String Fname; // First and last name
	private static String Lname;
	private static String findContact;
	private static int phoneNum;


	public static void main(String args[]) {
		displayOptions();
		
		

		// linked list for contacts names
		//LinkedList<String> name = new LinkedList<String>();
		
		// Adding elements
		
		// Removing elements

		// finding elements
		
		
		
		//Iterator find = (Iterator) name.iterator();         iterator is use to find specific elements in a linked list
		//while( find.next()) {
			
			//if((String) find.next() == findContact) {
		///		
			//}
			
	//	}

		//LinkedList<Integer> num = new LinkedList<Integer>();

		// Add number
		//num.add(phoneNum);
		// remove number

		// find number

	}
	
	public static void displayOptions() { // options
		Scanner scan = new Scanner(System.in);
		
		contacts NC = new contacts();

		System.out.println("Choose your option 1, 2, 3.");
		System.out.println("1. Call contact");
		System.out.println("2. Save contact");
		System.out.println("3. Find contact");
		System.out.println("4. Remove contact");

		// Break later
		int choice = scan.nextInt();
		scan.nextLine();

		// Switch and Cases
		switch (choice) {

		case 1:
			System.out.println("\nWho would you like to call? (First name, Last name)");
			NC.display();
			break;

		case 2:
			System.out.println("\nWhat is the name of the contact you would like to save (First name, Last name");
			System.out.println();
			System.out.println("Enter the contacts first name ");
			Fname = scan.nextLine();
		
			

			System.out.println();
			System.out.println("Enter the contacts last name");
			Lname = scan.nextLine();

			System.out.println("\nWhat is the number you are saving?");
			phoneNum = scan.nextInt();
			System.out.println("\n");
			NC.add(phoneNum);
			NC.display();

			break;

		case 3:
			System.out.println("What is the name of the contact you are searching?");
			System.out.println();
			findContact = scan.nextLine();
			// display contact list

			break;
			
		case 4:
			System.out.println("What contact would you like to remove");
			//display contact list

		default: // default case is used to perform the task when none of the cases is true

			break;
		}
	}

	// Getter/Setter for first and last name
	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

}
