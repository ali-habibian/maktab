package w9_1.phonecontacts;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private String name;
    ArrayList<Contact> contacts = new ArrayList<Contact>();

    public boolean addContact(Contact contact) {
        if (contacts.contains(contact)) {
            throw new ContactIsExist("The contact is exist.");
        }
        contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (contacts.contains(oldContact)) {
            int index = contacts.indexOf(oldContact);
            contacts.set(index, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (contacts.contains(contact)) {
            contacts.remove(contact);
            return true;
        }
        throw new ContactNotFound("The contact does not exist");
    }

    public void printContactList(){
        if(contacts.isEmpty())
            throw new ContactListIsEmpty("The list is empty.");
        for(Contact currentContact : contacts){
            System.out.println("Contact name: " + currentContact.getName() + " | " +
                               "Phone number : " + currentContact.getPhoneNumber());
        }
    }


    private class ContactNotFound extends RuntimeException {
        public ContactNotFound(String message) {
            super(message);
        }
    }

    private class ContactIsExist extends RuntimeException {
        public ContactIsExist(String message) {
            super(message);
        }
    }

    private class ContactListIsEmpty extends RuntimeException{
        public ContactListIsEmpty(String message) {
            super(message);
        }
    }


}
