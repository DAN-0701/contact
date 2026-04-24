public class Main {
    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        Contact c1 = new Contact();
        c1.name = "Alice";
        c1.phoneNumber = "0102030405";
        myContactsManager.addContact(c1);

        Contact c2 = new Contact();
        c2.name = "Bob";
        c2.phoneNumber = "0542300950";
        myContactsManager.addContact(c2);

        Contact c3 = new Contact();
        c3.name = "Charlie";
        c3.phoneNumber = "0705024759";
        myContactsManager.addContact(c3);

        Contact c4 = new Contact();
        c4.name = "Diane";
        c4.phoneNumber = "0566778899";
        myContactsManager.addContact(c4);

        Contact result = myContactsManager.searchContact("Charlie");
        if (result != null) {
            System.out.println("Numéro de Charlie : " + result.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}