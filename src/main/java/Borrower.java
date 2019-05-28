import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int countBooks() {
        return this.borrowedBooks.size();
    }

    public void addBook(Book book) {
        this.borrowedBooks.add(book);
    }


    public boolean currentlyRentingBook(Book book) {
    return this.borrowedBooks.contains(book);
    }

    public void borrowBookFromLibrary(Library library, Book book) {
        this.addBook(library.removeAndReturnBook(book));
    }
}
