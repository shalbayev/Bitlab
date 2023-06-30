package newFolder;

public class Student {
    int id;
    String name;
    String surname;
    double gpa;

    public Student() {
    }

    public Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    String getStudentData(){
        return "ID: " + id + " Full Name:" + name + " " + surname + " " + "GPA: " + gpa;
    }
    public String toString(){
        return "ID " + id + "Full name " + name + " " + surname + " " + "GPA " + gpa;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", gpa=" + gpa +
//                '}';
//    }
}
