package org.example.services;

import org.example.services.model.Book;
import org.example.services.model.Books;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BookService {

    @GET("/BookStore/v1/Books")
    Call<Books> getBooks();

    @GET("/BookStore/v1/Book")
    Call<Book> getBook(@Query("ISBN") String isbn);

}
