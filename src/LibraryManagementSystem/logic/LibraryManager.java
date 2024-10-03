package LibraryManagementSystem.logic;

import LibraryManagementSystem.domin.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {

    private List<Book> books;

    public LibraryManager(){
        this.books = new ArrayList<>();
    }
}
