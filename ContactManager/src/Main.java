public class Main {
    public static void main(String []args) {
        System.out.println("Start contacts app");

        ContactsManager myContactsManager = new ContactsManager();

        Contact friend1 = new Contact();
        friend1.name = "Resa";
        friend1.phoneNumber = "0123456789";
        myContactsManager.addContact(friend1);

    }
}
