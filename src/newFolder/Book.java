package newFolder;

public class Book {
    int id;
    String bookName;
    String authorName;

    public Book() {
    }

    public Book(int id, String bookName, String authorName) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
    }
    public String getData(){
        return "ID: " + id + " Name: " + bookName + " Author: " + authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
