package BridgeLabz.AddressBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {

	void address_Book(AddressBookMethods addressMethod) {
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

	public static void main(String[] arg) {
		System.out.println("Welcome to Address book");
		Map<String, AddressBookMethods> addressbookMap = new HashMap<String, AddressBookMethods>();
		String name = null;
		while (true) {

			System.out.println("Enter the Address book name");
			Scanner scanner = new Scanner(System.in);
			name = scanner.nextLine();
			AddressBookMethods addressMethods = addressbookMap.get(name);
			if (addressMethods == null) {
				addressMethods = new AddressBookMethods();
				addressbookMap.put(name, addressMethods);
			}

			AddressBook book = new AddressBook();
			book.address_Book(addressMethods);
			System.out.println("Press 1 : Want to enter in other addressbook");
			System.out.println("Press any other digit to exit");
			String choise = scanner.nextLine();
			if (!choise.equals("1"))
				break;
		}
	}

}
