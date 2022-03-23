package org.example.services.api;

import org.apache.log4j.Logger;
import org.example.services.BookService;
import org.example.services.RetrofitProvider;
import org.example.services.model.Book;
import org.example.services.model.Books;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class BookServiceImplementation {

    private final BookService service = RetrofitProvider.getInstance().create(BookService.class);
    private static final Logger logger = Logger.getLogger(BookServiceImplementation.class);

    public Books getBooks() throws IOException{
        Call<Books> booksCall = service.getBooks();

        logger.debug("Make request " + booksCall.request());
        Response<Books> booksResponse = booksCall.execute();
        logger.debug("Response Status code " + booksResponse.code() + "; Message " + booksResponse.message());

        if (booksResponse.isSuccessful()){
            logger.debug(booksResponse.body());
            Books books = booksResponse.body();
            return books;
        }else {
            if(booksResponse.errorBody() != null){
                logger.debug("Error " + booksResponse.errorBody());
            }
            throw new RuntimeException("Something wrong in your REQUEST");
        }
    }

    public Book getBook() throws IOException{
        Call<Book> bookCall = service.getBook("9781449325862");

        logger.debug("Make request " + bookCall.request());
        Response<Book> bookResponse = bookCall.execute();
        logger.debug("Response Status code " + bookResponse.code() + "; Message " + bookResponse.message());

        if (bookResponse.isSuccessful()){
            logger.debug(bookResponse.body());
            Book book = bookResponse.body();
            return book;
        }else {
            if(bookResponse.errorBody() != null){
                logger.debug("Error " + bookResponse.errorBody());
            }
            throw new RuntimeException("Something wrong in your REQUEST");
        }

    }

}
