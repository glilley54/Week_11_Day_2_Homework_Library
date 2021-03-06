import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setUp() {
        library = new Library("New York Library");
        book = new Book("The Shining", "Stephen King", "Horror");
    }

    @Test
    public void canCountStock() {
        assertEquals(0, library.bookCount());
    }
    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1,library.bookCount());
    }

}
