package constructor.sessions;

public class Library {
    int id;
    String name;
    String adress;
    Book[] books;

    public Library(int id, String name, String adress, Book[] books) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.books = books;
    }

    public void getBooks() {
        System.out.println("Library " + name + " books:");
        for (Book book : books) {
            System.out.println("ID: " + book.id + ", Book Name: " + book.bookName + ", Price: " + book.price +
                    ", Genre: " + book.genre + ", Create Date: " + book.createDate);
        }
    }
}