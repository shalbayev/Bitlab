package example;

public class Human {
    String name;
    int age;
    int height;
    public static final double pi = 3.14; //это переменная константа, вообще не меняется
    public static String name2; //не меняется, для всех обьектов один name2
    public Human(){
        this.name = "No name";
        this.age = 0;
        this.height = 0;

    }
    public Human(String name,int age, int height, String name2){
        this.name = name;
        this.age = age;
        this.height = height;
        this.name2 = name2;
    }
    public void run(){
        System.out.println("Name: " + name + " Age: " + age + " Height: " + height);
    }
    public String toString(){
        return name + " " + age + " " + height + " " + name2;
    }
}
