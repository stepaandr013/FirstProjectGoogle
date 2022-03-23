import org.example.services.api.BookServiceImplementation;
import org.example.services.model.Book;
import org.example.services.model.Books;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class BookTest {

    private static BookServiceImplementation serviceImplementation;

    @BeforeAll
    public static void setUp(){
        serviceImplementation = new BookServiceImplementation();
    }

//    @Test
//    public void getBooks() throws IOException {
//        Books books = serviceImplementation.getBooks();
//        Assertions.assertFalse(books.getBooks().isEmpty());
//    }

    @Test
    public void getBook() throws IOException {
        Book book = serviceImplementation.getBook();
        Assertions.assertFalse(book.getAuthor().isEmpty());
    }
}
