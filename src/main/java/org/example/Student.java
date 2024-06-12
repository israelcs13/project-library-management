import Book;

public class Student extends Users{
    private ArrayList<Book> borrowedBooks;

    public Student(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = new ArrayList<Book>;
    }
    //setters and getters

    public ArrayList<Book> getBorrowedBooks() {

        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    //methods
    public void searchBooks(){};
    public void askForBooks(){};
    public void returnBooks(){}

}
