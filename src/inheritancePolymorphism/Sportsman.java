package inheritancePolymorphism;

public class Sportsman {
    protected String fullName;
    protected int age;
    protected String country;

    public Sportsman() {
    }

    public Sportsman(String fullName, int age, String country) {
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }
    /*Например, если fullName = "Ilyas", age = 30, country = "Kazakhstan", то тогда текст вывода будет:
            "Sportsman Ilyas from Kazakhstan 30 years old is playing"*/
    String play(){
        return "Sportsman " + fullName + " from " + country + " " + age + " years old is playing for ";
    }
}
