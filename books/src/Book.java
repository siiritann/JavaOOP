public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    // constructor
    public Book(String  title, String author) {
        this.title = title;
        this.author = author;
    }

    // getter
    public boolean isBookBorrowed(){
        return isBorrowed;
    }

    // setterid
    public void borrowBook(){
        isBorrowed = true;
    }

    public void returnBook(){
        isBorrowed = false;
    }

}
