import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void setUp() {
        library = new Library(3);
        book = new Book("Of Mice and Men", "John Steinbeck", "Fiction");
        book2 = new Book("Macbeth", "William Shakespeare", "Tragedy");
        book3 = new Book("The Iliad", "Homer", "Epic Poetry");
        book4 = new Book("The Odyssey", "Homer", "Epic Poetry");
    }
    
    @Test
    public void hasCapacity() {
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void collectionStartsEmpty() {
        assertEquals(0, library.countCollection());
    }

    @Test
    public void canAddBookToCollection() {
        library.addBook(book);
        assertEquals(1, library.countCollection());
    }

    @Test
    public void cannotAddBookToCollection__Full() {
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.countCollection());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        library.removeBook(book);
        assertEquals(0, library.countCollection());
    }

    @Test
    public void bookIsCurrentlyAvailable() {
        library.addBook(book);
        assertEquals(true, library.bookAvailable(book));
    }

    @Test
    public void bookIsNotCurrentlyAvailable() {
        assertEquals(false, library.bookAvailable(book));
    }

    @Test
    public void canRemoveAndReturnABook() {
        library.addBook(book);
        assertEquals(book, library.removeAndReturnBook(book));
        assertEquals(0, library.countCollection());
    }

    @Test
    public void canCountByGenre() {
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book2);
        assertEquals(2, library.trackByGenre().size());
    }
}
