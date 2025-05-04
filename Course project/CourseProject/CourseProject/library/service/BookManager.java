package library.service;

import library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }


    public boolean removeBookByIsbn(int isbn) {
        return books.removeIf(book -> book.getIsbn() == isbn);
    }
}
