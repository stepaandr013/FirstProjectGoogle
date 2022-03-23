package org.example.services.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Books {
    @SerializedName("books")
    private List<Book> books;

    public Books(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Books{" +
                "books=" + books +
                '}';
    }
}

