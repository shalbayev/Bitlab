package lamdaExpression;

public class Student {
    String fullName;
    int age;
    double gpa;
    int height;


    public Student() {
    }

    public Student(String fullName, int age, double gpa, int height) {
        this.fullName = fullName;
        this.age = age;
        this.gpa = gpa;
        this.height = height;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", height=" + height +
                '}';
    }
}
