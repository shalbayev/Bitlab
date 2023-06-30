package oop;

public class Main {
    public static void main(String[] args) {
        StudentHouse house = new StudentHouse();
        house.addStudent(new Student(1,"Temirlan","Shalbayev", 3.5));
        house.addStudent(new Student(2,"Arman","Irisbekov", 3.5));
        house.addStudent(new Student(2,"Erka","Zhaaka", 4.2));
        house.addStudent(new Student(2,"Abluha","Abilq", 1.5));
        house.deleteStudents(3);
        System.out.println(house.theBestStudent());
//        house.printStudents();
//        Date data = new Date(13,12,2022);
//        System.out.println(data.getDate());



    }
}
