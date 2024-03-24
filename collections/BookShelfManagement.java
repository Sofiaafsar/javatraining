package Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

class Book {
    private String title;
    private String author;
    private String publicationYear;

    public Book(String title, String author, String publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
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

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear='" + publicationYear + '\'' +
                '}';
    }
}

public class BookShelfManagement {

    NavigableSet<Book> bookshelf = new TreeSet<>(Comparator.comparing(Book::getPublicationYear));

    public void addbooks(Book book) {
        bookshelf.add(book);
    }

    public void removebook(String Publicationyear) {
        bookshelf.removeIf(book -> book.getPublicationYear().equals(Publicationyear));
    }

    public void reverseshelf() {
        NavigableSet<Book> reversedshelf = new TreeSet<>(bookshelf.descendingSet());
        Iterator<Book> iterator = reversedshelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        BookShelfManagement shelf = new BookShelfManagement();
        Book book1 = new Book("HalfGirlFriend", "Chetan Bhagat", "2016");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "1960");
        Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", "1951");
        shelf.addbooks(book1);
        shelf.addbooks(book2);
        shelf.addbooks(book3);
        shelf.removebook("1960");
        shelf.reverseshelf();
    }
}
