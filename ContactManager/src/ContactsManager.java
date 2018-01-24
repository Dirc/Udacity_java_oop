public class ContactsManager {
    // Fields:
    int contactCounter;
    Contact [] myContacts;

    // Constructor
    ContactsManager() {
        this.contactCounter = 0;
        this.myContacts = new Contact[500];
    }

    // Methods
    void addContact(Contact contact) {
        myContacts[contactCounter] = contact;
        contactCounter++;
    }

}
