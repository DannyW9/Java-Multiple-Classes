import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;
    private Book book2;

    @Before
    public void setUp() {
        borrower = new Borrower("Pablo");
        library = new Library(3);
        book = new Book("Macbeth", "William Shakespeare", "Tragedy");
        book2 = new Book("The Iliad", "Homer", "Epic Poetry");
    }

    @Test
    public void hasName() {
        assertEquals("Pablo", borrower.getName());
    }

    @Test
    public void borrowedBooksStartsAt0() {
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void canAddBook() {
        borrower.addBook(book);
        assertEquals(1, borrower.countBooks());
    }

    @Test
    public void isCurrentlyRentingBook() {
        borrower.addBook(book);
        assertEquals(true, borrower.currentlyRentingBook(book));
    }

    @Test
    public void isNotCurrentlyRentingBook() {
        assertEquals(false, borrower.currentlyRentingBook(book));
    }

    @Test
    public void canBorrowBookFromLibrary() {
        library.addBook(book);
        borrower.borrowBookFromLibrary(library, book);
        assertEquals(0, library.countCollection());
        assertEquals(1, borrower.countBooks());
        assertEquals(false, library.bookAvailable(book));
        assertEquals(true, borrower.currentlyRentingBook(book));
    }
}
