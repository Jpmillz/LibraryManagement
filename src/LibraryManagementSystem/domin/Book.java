package LibraryManagementSystem.domin;

public class Book implements Comparable<Book>{

    private String title;
    private String author;
    private int pageCount;
    private Genre genre;

    public Book(String title, String author, int pageCount, Genre genre){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.author + ", " + this.pageCount + " pages, " + this.genre;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}
