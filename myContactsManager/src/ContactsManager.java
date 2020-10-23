public class ContactsManager {

    // Fields
    Contact [] myFriends;
    int friendsCount;

    // Constructur

    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends= new Contact[500];
    }

    // Methods

    void addContact(Contact contact) { // takes contact object as input parameter
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount ; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}
