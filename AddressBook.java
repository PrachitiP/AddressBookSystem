package BridgeLabz.AddressBook;

import java.util.Scanner;
public class AddressBook {

	public static void main(String[] arg) {
		System.out.println("Welcome to Address book");
		AddressBookMethods addressMethod = new AddressBookMethods();
		while (true) {
			System.out.println("Press 1 : Add Contact");
			System.out.println("Press 2 : Edit Contact");
			System.out.println("Press 3 : Print Contact");
			System.out.println("Press 4 : Delete Contact");
			System.out.println("Press 0 : Exit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				addressMethod.Add();
				break;
			case 2:
				addressMethod.Edit();
				break;
			case 3:
				addressMethod.Show();
				break;
			case 4:
				addressMethod.Delete();
				break;
			case 0:
				return;
			default:
				System.out.println("Please Enter Correct Option");
			}
		}

	}

}
