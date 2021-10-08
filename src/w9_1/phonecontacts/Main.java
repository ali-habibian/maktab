package w9_1.phonecontacts;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static MobilePhone mb = new MobilePhone();

    public static void main(String[] args) {


        while (true) {
            System.out.println("1) add a contact");
            System.out.println("2) update contact");
            System.out.println("3) delete a contact");
            System.out.println("4) print the list of contacts");
            System.out.println("5) Exit the program");

            System.out.println("Please select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter name :");
                    String name = scanner.next();
                    System.out.println("Enter phone numebr :");
                    String phoneNumber = scanner.next();
                    Contact newContact = new Contact(name, phoneNumber);
                    mb.addContact(newContact);
                    break;

                case 2:
                    System.out.println("Enter name of old contact :");
                    String oldName = scanner.next();
                    System.out.println("Enter phone numebr of old contact :");
                    String oldPhoneNumber = scanner.next();

                    Contact oldContact = new Contact(oldName, oldPhoneNumber);

                    System.out.println("Enter name of new contact :");
                    String newName = scanner.next();
                    System.out.println("Enter phone numebr of new contact :");
                    String newPhoneNumber = scanner.next();

                    Contact currentContact = new Contact(newName, newPhoneNumber);

                    mb.updateContact(oldContact, currentContact);
                    break;


                case 3:
                    System.out.println("Enter name :");
                    name = scanner.next();
                    System.out.println("Enter phone numebr :");
                    phoneNumber = scanner.next();

                    Contact foundContact = new Contact(name, phoneNumber);
                    mb.removeContact(foundContact);
                    break;

                case 4:
                    System.out.println("The list of contacts: ");
                    mb.printContactList();
                    break;

                case 5 :
                    System.out.println("Exiting the application...");
                    System.exit(0);
                    break;

                default :
                    System.out.println("Incorrect input, Please Enter a correct Number");

            }

        }

    }
}
