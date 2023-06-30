package classAndObjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        BookHouse bookHouse = new BookHouse();
        Book book1 = new Book(98574, "Alice in Wonderland", "Logis K.Rroll");
        bookHouse.addBook(book1);
        bookHouse.printBooks();

    }
//    The phone Iphone - 11 Pro for 400000 KZT
//Is better than XIAOMI - Redmi Note 10 for 100000 KZT
}
