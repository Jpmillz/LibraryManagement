package LibraryManagementSystem;

import LibraryManagementSystem.domin.Book;
import LibraryManagementSystem.domin.Genre;
import LibraryManagementSystem.logic.LibraryManager;
import LibraryManagementSystem.userinterface.TextUserinterface;

public class Main {
    public static void main(String[] args) {

        LibraryManager man = new LibraryManager();
        man.addBook(new Book("Mistborn", "Joel cortex", 123, Genre.SCIFI));
        man.addBook(new Book("Apple", "Joel cortex", 123, Genre.BIOGRAPHY));
        man.addBook(new Book("Beta", "Joel cortex", 123, Genre.FICTION));

        man.getBooks().stream().sorted().forEach(System.out::println);
        System.out.println();
        man.getBooksOfGenre(Genre.SCIFI).forEach(System.out::println);
    }
}
