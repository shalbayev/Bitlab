package classAndObjects;

import java.util.Arrays;

public class BookHouse {
    Book[] books = new Book[1000];
    int size = 0;
    void addBook(Book book){
        books[size] = book;

        size++;
    }
    void printBooks(){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i].getData());
        }
    }

    void searchBook(String name){
        for (int i = 0; i < books.length; i++) {
            if(books[i].equals(name)){
                System.out.println(books[i].getData());
            }
            else System.out.println("Data Not Found");
        }
    }
}
