package BridgeLabz.AddressBook;

import java.util.ArrayList;

public class AddressMethods {
	ArrayList<Contacts> addressBook = new ArrayList<Contacts>();

	void Add() {
		 Contacts address = new Contacts();
		 addressBook.add(address);
	}
}
