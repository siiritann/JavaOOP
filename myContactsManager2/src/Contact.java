public class Contact {
    String name;
    String email;
    String phoneNumber;

    // Constructor 1
    Contact() {
        this.name = "";
        this.phoneNumber = "";
    }

    // Constructor 2
    Contact(String name, String number) {
        this.name = name;
        this.phoneNumber = number;
    }
}

