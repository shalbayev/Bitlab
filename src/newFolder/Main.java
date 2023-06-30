package newFolder;

public class Main {
    public static void main(String[] args) {
//        Phone p = new Phone("Iphone", "11 pro", 400000);
////        System.out.println(p.getData());
//        Student s = new Student(18012, "Temirlan", "Shalbayev", 3.14);
////        System.out.println(s.getStudentData());
//        Student s2 = new Student(180101, "Arman", "Irisbekov", 2.0);
//        Student[] students = new Student[2];
//        students[0] = s;
//        students[1] = s2;
//
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i]);
//        }
//        Player[] pl = new Player[6];
//        pl[0] = new Player(7,"Cristiano","Ronaldo", "LW");
//        pl[1] = new Player(9,"Karim","Benzema", "FW");
//        pl[2] = new Player(11,"Gareth","Bale", "RW");
//        pl[3] = new Player(10,"Luka","Modric", "CM");
//        pl[4] = new Player(7,"Keilor","Navas", "GK");
//        pl[5] = new Player(7,"Sergio","Ramos", "CD");
//        Club cl =  new Club();
//        cl.name = "Real Madrid";
//        cl.country = "Spain";
//        cl.ratingPoints = 100;
//        cl.players = pl;
////        cl.printClubData();
//        Player[] pl2 = new Player[3];
//        pl2[0] = new Player(10,"Lionel","Messi","RW");
//        pl2[1] = new Player(9, "Luis", "Suarez", "FW");
//        pl2[2] = new Player(11, "Da Silva", "Neymar", "LW");
//        Club cl2 = new Club();
//        cl2.name = "Barcelona";
//        cl2.country = "Spain";
//        cl2.ratingPoints = 98;
//        cl2.players = pl2;
//        Club[] clubs = {cl,cl2};
//        for (int i = 0; i < clubs.length; i++) {
//            clubs[i].printClubData();
//        }
        BookHouse bh = new BookHouse();

        Book b = new Book(1,"Abay joly", "Mukhtar Auezov");
        Book b2 = new Book(2, "Harry Potter","JK Rowling");
        bh.addBook(b);
        bh.addBook(b2);
        bh.printBooks();




    }
}
