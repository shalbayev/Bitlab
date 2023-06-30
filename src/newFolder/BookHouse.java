package newFolder;

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
        boolean check = true;
        for (int i = 0; i < size; i++) {
            if(name.equals(books[i].bookName)){
                books[i].getData();
                check = false;
            }

        }
        if(check){
            System.out.println("Data Not Found");
        }
    }
}
