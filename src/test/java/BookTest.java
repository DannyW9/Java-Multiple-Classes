import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before

    public void setUp() {
        book = new Book("Of Mice and Men", "John Steinbeck", "Fiction");
    }

    @Test
    public void hasTitle() {
        assertEquals("Of Mice and Men", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("John Steinbeck", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Fiction", book.getGenre());
    }
}
