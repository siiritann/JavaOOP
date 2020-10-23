public class ContactsManager {

    // Fields
    Contact [] myFriends; // Array of contacts: kõigepealt
    // array sees elemendi type, siis array def ja siis array
    // nimi

    int friendsCount;

    // Constructor for initialize
    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500]; // Contact array myFriends (just like any array) needs to be
        // initialized using the new keyword and we chose to reserve enough space in the array to
        // store up to 500 contacts.
    }

    // will add a Contact object to the Contact array myFriends
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;   // TODO: sellest reast ei saa aru https://classroom.udacity.com/courses/ud283/lessons/008b74dd-d786-4d22-84e6-ace8ae102ba4/concepts/371e2504-39c4-4f6b-902e-c140e45bd763
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount ; i++) {
            if (searchName.equals(myFriends[i].name)) {
                return myFriends[i];
            }
        }
        return null;
    }

}
