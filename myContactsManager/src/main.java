public class main {
    public static void main (String [] args){

        // System.out.println("Hello Siiri");

        ContactsManager myContactManager = new ContactsManager();

        Contact friendJames = new Contact();
        friendJames.name = "James";
        friendJames.phoneNumber = "00123";

        myContactManager.addContact(friendJames);

        Contact friendMari = new Contact();
        friendMari.name = "Mari";
        friendMari.phoneNumber = "0023";

        myContactManager.addContact(friendMari);

        Contact result = myContactManager.searchContact("Mari");
        System.out.println(result.phoneNumber);

        // Mihkli kontakti loomine
        Contact jyri = new Contact("Jyri", "23567");

    }

}
