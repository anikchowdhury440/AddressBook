import java.io.IOException;
import java.util.Scanner;

public class AddressBookMainClass {
	public static void main(String[] args) throws IOException {
		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		String fileType = null;
		System.out.println("Enter the file operation for Read and Write:");
		System.out.println("1. Using File IO");
		System.out.println("2. Using OpenCSV");
		System.out.println("Enter Your Choice: ");
		int choice = sc.nextInt();
		boolean valid = false;
		while(!valid) {
			switch(choice) {
				case 1:
					fileType = "File IO";
					valid = true;
					break;
				case 2:
					fileType = "OpenCSV";
					valid = true;
					break;
				default:
					System.out.println("Please Select Valid Option");
			}
		}
		boolean isTerminate = false;
		while(!isTerminate)
		{
			System.out.println("1.Add AddressBook");
			System.out.println("2.Add Person in Address Book");
			System.out.println("3.Display Person in Address Book");
			System.out.println("4.Edit Person in Address Book");
			System.out.println("5.Delete Person in Address Book");
			System.out.println("6.Search Person");
			System.out.println("7.Sort Person");
			System.out.println("8.Exit program");
			System.out.println("Enter Your Choice: ");
			int option = sc.nextInt();
			switch(option)
			{
				case 1:
					addressBook.createAddressBook(fileType);
					break;
				case 2:
					addressBook.addPerson(fileType);
					break;
				case 3:
					addressBook.displayPerson(fileType);
					break;
				case 4:
					addressBook.editPerson(fileType);
					break;
				case 5:
					addressBook.deletePerson(fileType);
					break;
				case 6:
					addressBook.searchPerson(fileType);
					break;
				case 7:
					addressBook.sortPerson(fileType);
					break;
				case 8:
					isTerminate = true;
					break;
				default:
					System.out.println("Please enter valid input.");
			}
		}
	}
}
