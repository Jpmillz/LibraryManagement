package LibraryManagementSystem.logic;

import LibraryManagementSystem.domin.Book;
import LibraryManagementSystem.domin.Genre;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryManager {

    private List<Book> books;

    public LibraryManager(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book toAdd){
        books.add(toAdd);
    }

    public List<Book> getBooks(){
        return books;
    }

    public List<Book> getBooksOfGenre(Genre genre){
        if (books.isEmpty()){
            return new ArrayList<>();
        }
        return books.stream()
                .filter(book -> book.getGenre().equals(genre))
                .collect(Collectors.toList());
    }

}
