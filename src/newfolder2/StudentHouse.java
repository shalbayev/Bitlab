package newfolder2;

public class StudentHouse {
    String name;
    Student[] students = new Student[1000];
    int size = 0;

    public StudentHouse() {
    }

    public StudentHouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void addStudent(Student student){
        students[size] = student;
        size++;
    }


    void printStudents(){
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }
    void deleteStudents(int i){
        for (int j = 0; j < size; j++) {
            if(i==j){
//                students[j]==null;
            }
        }
    }

}
