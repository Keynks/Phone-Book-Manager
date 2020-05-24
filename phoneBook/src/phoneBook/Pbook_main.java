package phoneBook;

import java.util.Scanner;
import phoneBook.*;


public class Pbook_main {

	private contacts list = new contacts();//our liknked list

	public static void main(String args[]) {
		Pbook_main ref = new Pbook_main();
		ref.displayOptions();






	}
	
	public void displayOptions() { // options
		Scanner scan = new Scanner(System.in);

		
		contacts NC = new contacts();

		System.out.println("Choose your option 1, 2, 3.");
		System.out.println("1. create contact");
		System.out.println("2. Save contact");
		System.out.println("3. Find contact");
		System.out.println("4. Remove contact");

		// Break later
		int choice = scan.nextInt();
		scan.nextLine();

		// Switch and Cases
		switch (choice) {

		case 1:
			Object contact = createContact();
			list.addLast(contact);
			System.out.println("This is the new updated contacts list");
			System.out.println(list.toString());



			break;

		case 2:
			break;


		case 3:

			// display contact list

			break;
			
		case 4:
			break;


		default: // default case is used to perform the task when none of the cases is true

			break;
		}
	}


	public Object createContact() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nWhat is the contacts first name??");
		String fName = sc.next();
		System.out.print("\nWhat is their last name??");
		String lName = sc.next();
		System.out.print("\nwhat is their phone number??");
		String pNumber = sc.next();
		System.out.print("\nWhat is their email??\n");
		String email = sc.next();

		pbConstructor newContact = new pbConstructor(fName,lName,pNumber,email);//creating a new object

		return newContact;
	}


}
