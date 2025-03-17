package constructorSessions;

import java.time.LocalDate;

public class Book {
    int id;
    String bookName;
    double price;
    String genre;
    LocalDate createDate;

    public Book(int id, String bookName, double price, String genre, LocalDate createDate) {
        this.id = id;
        this.bookName = bookName;
        this.price = price;
        this.genre = genre;
        this.createDate = createDate;
    }
}
