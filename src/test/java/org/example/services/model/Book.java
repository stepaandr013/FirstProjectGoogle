package org.example.services.model;

import com.google.gson.annotations.SerializedName;

public class Book {
    @SerializedName("isbn")
    private String isbn;
    @SerializedName("title")
    private String title;
    @SerializedName("subtitle")
    private String subtitle;
    @SerializedName("author")
    private String author;
    @SerializedName("publish_date")
    private String publishDate;
    @SerializedName("publisher")
    private String publisher;
    @SerializedName("pages")
    private int pages;
    @SerializedName("description")
    private String descriptions;
    @SerializedName("website")
    private String website;

    private Book() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", author='" + author + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pages=" + pages +
                ", descriptions='" + descriptions + '\'' +
                ", website='" + website + '\'' +
                '}';
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public static class Builder{
        private Book book;

        public Builder() {
            book = new Book();
        }

        public Builder setIsbn(String isbn){
            book.setIsbn(isbn);
            return this;
        }

        public Builder setTitle(String title){
            book.setTitle(title);
            return this;
        }

        public Builder setSubtitle(String subtitle){
            book.setSubtitle(subtitle);
            return this;
        }

        public Book build(){
            return book;
        }
    }

}
