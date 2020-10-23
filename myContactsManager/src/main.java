public class main {
    public static void main (String [] args) {

        ContactsManager myContactsManager = new ContactsManager();

        // Using first constructor

        Contact james = new Contact();
        james.name = "james";
        james.phoneNumber = "123";
        myContactsManager.addContact(james);

        Contact jennie = new Contact();
        jennie.name = "jennie";
        jennie.phoneNumber = "4777";
        myContactsManager.addContact(jennie);


        // Using second constructor

        Contact mihkel = new Contact("mihkel", "999");
        myContactsManager.addContact(mihkel);

        System.out.println(myContactsManager.friendsCount);

        // System.out.println(myContactsManager.searchContact("a").phoneNumber); //

        Contact result = myContactsManager.searchContact("a");
        if (result == null){
            System.out.println("No contact found");
        }
        else {
            System.out.println(result.phoneNumber);
        }

    }
}
